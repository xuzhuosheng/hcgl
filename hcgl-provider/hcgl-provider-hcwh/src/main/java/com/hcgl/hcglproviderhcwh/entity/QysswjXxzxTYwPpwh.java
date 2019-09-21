package com.hcgl.hcglproviderhcwh.entity;

import java.io.Serializable;

/**
 * (QysswjXxzxTYwPpwh)实体类
 *
 * @author makejava
 * @since 2019-09-21 10:01:41
 */
public class QysswjXxzxTYwPpwh implements Serializable {
    private static final long serialVersionUID = 432850677503296662L;
    //主键ID
    private Integer id;
    //品牌名称
    private String ppmc;
    //类型id
    private String lxid;
    //类型名称
    private String lxmc;
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

    public String getPpmc() {
        return ppmc;
    }

    public void setPpmc(String ppmc) {
        this.ppmc = ppmc;
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