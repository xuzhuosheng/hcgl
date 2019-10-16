package com.hcgl.jwtauthorization;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class JWTAuthorizationApplication {
    public static void main(String[] args) {
        SpringApplication.run(JWTAuthorizationApplication.class, args);
    }
}
