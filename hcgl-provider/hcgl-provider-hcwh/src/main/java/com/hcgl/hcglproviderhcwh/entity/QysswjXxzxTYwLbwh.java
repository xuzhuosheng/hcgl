package com.hcgl.hcglproviderhcwh.entity;

import java.io.Serializable;

/**
 * (QysswjXxzxTYwLbwh)实体类
 *
 * @author makejava
 * @since 2019-09-23 16:13:37
 */
public class QysswjXxzxTYwLbwh implements Serializable {
    private static final long serialVersionUID = 615980671442413298L;
    //主键id
    private Integer id;
    //类别名称
    private String lbmc;
    //预算单价
    private Double ysdj;
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

    public Double getYsdj() {
        return ysdj;
    }

    public void setYsdj(Double ysdj) {
        this.ysdj = ysdj;
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