package com.hcgl.hcglproviderhcwh.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * (QysswjXxzxTYwPpwh)实体类
 *
 * @author makejava
 * @since 2019-09-23 16:13:06
 */
public class QysswjXxzxTYwPpwh implements Serializable {
    private static final long serialVersionUID = 339617314701449342L;
    //主键ID
    private Integer id;
    //品牌名称
    private String ppmc;
    //创建时间
    private Date createtime;
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

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
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