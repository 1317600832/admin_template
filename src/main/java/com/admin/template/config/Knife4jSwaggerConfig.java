package com.admin.template.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Knife4jSwaggerConfig {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .groupName("YangQian")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.admin.template.controller"))
                .paths(PathSelectors.any())
                .build()
                ;
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Knife4j-Swagger")
                .description("admin_template 接口文档")
                .contact(new Contact("杨乾", null, null))
                .version("1.0")
                .build();
    }

}
