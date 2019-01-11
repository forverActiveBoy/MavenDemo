package com.yunkan.realm;

import com.yunkan.dao.SysAdminDao;
import com.yunkan.entity.SysAdmin;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class MyRealmByAuthor extends AuthorizingRealm{
    @Autowired
    private SysAdminDao sysAdminDao;
    /**
     * s授权
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        String username = principalCollection.getPrimaryPrincipal().toString();
        // 根据用户名查询 角色/权限数据
        List<String> roleList = new ArrayList<>();
        List<String> primissionList = new ArrayList<>();
        roleList.add("role1");
        roleList.add("role100");
        primissionList.add("user:create");
        primissionList.add("banner:update");
        // 将数据交于shiro
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        info.addRoles(roleList);
        info.addStringPermissions(primissionList);
        return info;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        // 1. 根据token中的 账号 去数据查询是否存在
        String username = authenticationToken.getPrincipal().toString();
        // 调用dao 执行查询
        SysAdmin sysAdmin = sysAdminDao.selectByUsername(username);
        if(sysAdmin != null){
            SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(sysAdmin.getUsername(), sysAdmin.getPassword(), ByteSource.Util.bytes("abcd"), this.getName());
            return info;
        }
  /*      if(username.equals("myadmin")){
            SimpleAuthenticationInfo info = new SimpleAuthenticationInfo("myadmin","4581eac79fbb649365e91629539a96d1",ByteSource.Util.bytes("abcd"),this.getName());
            return info;
        }*/
        // 2. 如果存在 返回 info  如果不存在 返回null
        return null;
    }
}
