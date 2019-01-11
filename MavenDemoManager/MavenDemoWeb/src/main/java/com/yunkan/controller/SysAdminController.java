package com.yunkan.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/sysAdmin")
public class SysAdminController {
    @RequestMapping("/login.do")
    public @ResponseBody Map login(String username,String password){
        Map map = new HashMap();
        // 使用shiro帮我完成认证
        Subject subject = SecurityUtils.getSubject();
        try{
            subject.login(new UsernamePasswordToken(username,password));
            // 通过 主体获取身份信息
            String un = subject.getPrincipal().toString();
            map.put("isLogin",false);
        }catch (Exception e){
            //e.printStackTrace();
            map.put("isLogin",true);
        }
        return map;
    }
}
