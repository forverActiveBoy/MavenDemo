package com.yunkan.entity;

import java.util.Date;
import java.util.List;

public class SysResources {
    private Long id;
    private String resCode;//资源编码: 按钮权限根据编码做校验
    private String text;//资源名称
    private Long parentId;//父节点ID
    private String resUrl;//菜单地址 res_type=2 时为空
    private String resIcon;//资源图标
    private Integer resType;//资源类型  1:菜单  2:按钮
    private Integer sortNo;//排序号 越小越靠前
    private Integer status;//状态 1:有效 0:无效
    private Long createBy;//创建人
    private java.util.Date createTime;//创建时间
    private Integer enable;//数据有效性 1:有效 0:无效,为0时 不会在系统中查询出来
    private List<SysResources> children;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getResCode() {
        return resCode;
    }

    public void setResCode(String resCode) {
        this.resCode = resCode;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getResUrl() {
        return resUrl;
    }

    public void setResUrl(String resUrl) {
        this.resUrl = resUrl;
    }

    public String getResIcon() {
        return resIcon;
    }

    public void setResIcon(String resIcon) {
        this.resIcon = resIcon;
    }

    public Integer getResType() {
        return resType;
    }

    public void setResType(Integer resType) {
        this.resType = resType;
    }

    public Integer getSortNo() {
        return sortNo;
    }

    public void setSortNo(Integer sortNo) {
        this.sortNo = sortNo;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getEnable() {
        return enable;
    }

    public void setEnable(Integer enable) {
        this.enable = enable;
    }


    public List<SysResources> getChildren() {
        return children;
    }

    public void setChildren(List<SysResources> children) {
        this.children = children;
    }


    @Override
    public String toString() {
        return "SysResources{" +
                "id=" + id +
                ", resCode='" + resCode + '\'' +
                ", text='" + text + '\'' +
                ", parentId=" + parentId +
                ", resUrl='" + resUrl + '\'' +
                ", resIcon='" + resIcon + '\'' +
                ", resType=" + resType +
                ", sortNo=" + sortNo +
                ", status=" + status +
                ", createBy=" + createBy +
                ", createTime=" + createTime +
                ", enable=" + enable +
                ", children=" + children +
                '}';
    }
}
