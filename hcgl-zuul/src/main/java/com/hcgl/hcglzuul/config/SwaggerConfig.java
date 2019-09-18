package com.hcgl.hcglzuul.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.UiConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * swagger 配置类
 */

@Configuration
@EnableSwagger2
public class SwaggerConfig {


    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .build();

    }


    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("好彩管理系统")
                .description("系统接口文档说明")
                .termsOfServiceUrl("http://localhost:5000")
                .contact(new Contact("zhuosheng","","284696920@qq.com"))
                .version("1.0")
                .build();
    }

    @Bean
    UiConfiguration uiConfiguration() {
        return new UiConfiguration(null, "list", "alpha", "schema",
                UiConfiguration.Constants.DEFAULT_SUBMIT_METHODS, false, true, 60000L);
    }




}
