package com.hcgl.hcglproviderhcwh.entity;

import java.io.Serializable;

/**
 * (QysswjXxzxTYwXhwh)实体类
 *
 * @author makejava
 * @since 2019-09-23 16:13:24
 */
public class QysswjXxzxTYwXhwh implements Serializable {
    private static final long serialVersionUID = 581961162223242833L;
    //主键 ID
    private Integer id;
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