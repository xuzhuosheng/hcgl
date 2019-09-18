package com.hcgl.hcgleureka;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class HcglEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(HcglEurekaApplication.class, args);
    }
}
