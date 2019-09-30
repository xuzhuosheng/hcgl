package com.hcgl.hcglproviderhcwh.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

@PropertySource ("classpath:application.yml")
public class BaseController {
    @Value ("${pageSize}")
    public int pageSize;
}
