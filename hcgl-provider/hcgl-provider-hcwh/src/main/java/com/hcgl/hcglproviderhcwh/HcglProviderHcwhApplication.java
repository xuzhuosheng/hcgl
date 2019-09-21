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

    @Value ("${myname}")
    private static String myname;

    @Value ("${pageSize}")
    private static String pageSize;


    public static void main(String[] args) {
        System.out.println(myname);
        System.out.println(pageSize);
        SpringApplication.run(HcglProviderHcwhApplication.class, args);
    }

}
