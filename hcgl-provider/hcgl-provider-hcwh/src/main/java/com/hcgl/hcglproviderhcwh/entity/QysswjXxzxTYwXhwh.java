package com.hcgl.hcglproviderhcwh.entity;

import java.io.Serializable;

/**
 * (QysswjXxzxTYwXhwh)实体类
 *
 * @author makejava
 * @since 2019-09-21 10:02:28
 */
public class QysswjXxzxTYwXhwh implements Serializable {
    private static final long serialVersionUID = -52414028846386341L;
    //主键 ID
    private Integer id;
    //类型ID
    private String lxid;
    //类型名称
    private String lxmc;
    //品牌ID
    private String ppid;
    //品牌名称
    private String ppmc;
    //型号
    private String xhmc;
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

    public String getLxid() {
        return lxid;
    }

    public void setLxid(String lxid) {
        this.lxid = lxid;
    }

    public String getLxmc() {
        return lxmc;
    }

    public void setLxmc(String lxmc) {
        this.lxmc = lxmc;
    }

    public String getPpid() {
        return ppid;
    }

    public void setPpid(String ppid) {
        this.ppid = ppid;
    }

    public String getPpmc() {
        return ppmc;
    }

    public void setPpmc(String ppmc) {
        this.ppmc = ppmc;
    }

    public String getXhmc() {
        return xhmc;
    }

    public void setXhmc(String xhmc) {
        this.xhmc = xhmc;
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