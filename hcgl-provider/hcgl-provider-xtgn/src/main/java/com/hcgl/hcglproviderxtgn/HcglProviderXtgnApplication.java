package com.hcgl.hcglproviderxtgn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.hcgl.hcglproviderxtgn.dao")
public class HcglProviderXtgnApplication {

    public static void main(String[] args) {
        SpringApplication.run(HcglProviderXtgnApplication.class, args);
    }


}
