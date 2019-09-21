package com.hcgl.hcglproviderhcwh.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyConfig {
    @Value ("${pageSize}")
    private int pageSize;

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public MyConfig() {
        this.pageSize = pageSize;
    }


}
