package com.hcgl.hcglproviderhcwh;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan ("com.hcgl.hcglproviderhcwh.dao")
public class HcglProviderHcwhApplication {
    public static void main(String[] args) {
        SpringApplication.run(HcglProviderHcwhApplication.class, args);
    }

}
