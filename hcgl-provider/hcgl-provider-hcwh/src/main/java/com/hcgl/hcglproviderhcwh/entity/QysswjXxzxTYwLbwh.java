package com.hcgl.hcglproviderhcwh.entity;

import java.io.Serializable;

/**
 * (QysswjXxzxTYwLbwh)实体类
 *
 * @author makejava
 * @since 2019-09-21 10:03:41
 */
public class QysswjXxzxTYwLbwh implements Serializable {
    private static final long serialVersionUID = -88725904170856102L;
    //主键id
    private Integer id;
    //类别名称
    private String lbmc;
    //类型名称
    private String lxmc;
    //类型id
    private String lxid;
    //品牌名称
    private String ppmc;
    //品牌id
    private String ppid;
    //型号名称
    private String xhmc;
    //型号id
    private String xhid;
    //创建时间
    private Object createtime;
    //状态
    private String zt;
    //备注
    private String bz;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLbmc() {
        return lbmc;
    }

    public void setLbmc(String lbmc) {
        this.lbmc = lbmc;
    }

    public String getLxmc() {
        return lxmc;
    }

    public void setLxmc(String lxmc) {
        this.lxmc = lxmc;
    }

    public String getLxid() {
        return lxid;
    }

    public void setLxid(String lxid) {
        this.lxid = lxid;
    }

    public String getPpmc() {
        return ppmc;
    }

    public void setPpmc(String ppmc) {
        this.ppmc = ppmc;
    }

    public String getPpid() {
        return ppid;
    }

    public void setPpid(String ppid) {
        this.ppid = ppid;
    }

    public String getXhmc() {
        return xhmc;
    }

    public void setXhmc(String xhmc) {
        this.xhmc = xhmc;
    }

    public String getXhid() {
        return xhid;
    }

    public void setXhid(String xhid) {
        this.xhid = xhid;
    }

    public Object getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Object createtime) {
        this.createtime = createtime;
    }

    public String getZt() {
        return zt;
    }

    public void setZt(String zt) {
        this.zt = zt;
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
    }

}