package com.yunkan.entity;
public class SysAdmin {
    private Long id;
    private String username;//登录名
    private String mobile;//手机号
    private String password;//密码
    private String nickname;//昵称 如:管理员
    private Integer type;//类型  1:平台管理员 2:商会管理员 3:商家管理员4.油站管理员
    private Integer status;//状态  1:启用 0:禁用
    private Integer loginErrorCount;//登录错误次数
    private java.util.Date lastLoginTime;//最后一次登录时间
    private String lastLoginIp;//最后一次登录IP
    private java.util.Date createTime;//创建时间
    private Long createBy;//创建人
    private Integer enable;//数据有效性 1:有效 0:无效,为0时 不会在系统中查询出来
    private Long lastUpdateBy;//最后修改人
    private java.util.Date lastUpdateTime;//最后修改时间
    private String attribute1;//备用字段1
    private String attribute2;//备用字段2
    private String attribute3;//备用字段3
    private String attribute4;//备用字段4
    public SysAdmin() {
        super();
    }
    public SysAdmin(Long id,String username,String mobile,String password,String nickname,Integer type,Integer status,Integer loginErrorCount,java.util.Date lastLoginTime,String lastLoginIp,java.util.Date createTime,Long createBy,Integer enable,Long lastUpdateBy,java.util.Date lastUpdateTime,String attribute1,String attribute2,String attribute3,String attribute4) {
        super();
        this.id = id;
        this.username = username;
        this.mobile = mobile;
        this.password = password;
        this.nickname = nickname;
        this.type = type;
        this.status = status;
        this.loginErrorCount = loginErrorCount;
        this.lastLoginTime = lastLoginTime;
        this.lastLoginIp = lastLoginIp;
        this.createTime = createTime;
        this.createBy = createBy;
        this.enable = enable;
        this.lastUpdateBy = lastUpdateBy;
        this.lastUpdateTime = lastUpdateTime;
        this.attribute1 = attribute1;
        this.attribute2 = attribute2;
        this.attribute3 = attribute3;
        this.attribute4 = attribute4;
    }
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMobile() {
        return this.mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return this.nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Integer getType() {
        return this.type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getLoginErrorCount() {
        return this.loginErrorCount;
    }

    public void setLoginErrorCount(Integer loginErrorCount) {
        this.loginErrorCount = loginErrorCount;
    }

    public java.util.Date getLastLoginTime() {
        return this.lastLoginTime;
    }

    public void setLastLoginTime(java.util.Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public String getLastLoginIp() {
        return this.lastLoginIp;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }

    public java.util.Date getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    public Long getCreateBy() {
        return this.createBy;
    }

    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    public Integer getEnable() {
        return this.enable;
    }

    public void setEnable(Integer enable) {
        this.enable = enable;
    }

    public Long getLastUpdateBy() {
        return this.lastUpdateBy;
    }

    public void setLastUpdateBy(Long lastUpdateBy) {
        this.lastUpdateBy = lastUpdateBy;
    }

    public java.util.Date getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    public void setLastUpdateTime(java.util.Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public String getAttribute1() {
        return this.attribute1;
    }

    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1;
    }

    public String getAttribute2() {
        return this.attribute2;
    }

    public void setAttribute2(String attribute2) {
        this.attribute2 = attribute2;
    }

    public String getAttribute3() {
        return this.attribute3;
    }

    public void setAttribute3(String attribute3) {
        this.attribute3 = attribute3;
    }

    public String getAttribute4() {
        return this.attribute4;
    }

    public void setAttribute4(String attribute4) {
        this.attribute4 = attribute4;
    }

}
