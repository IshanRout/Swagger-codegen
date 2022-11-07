package com.example.swagger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/*echo "# Swagger-codegen" >> README.md
        git init
        git add README.md
        git commit -m "first commit"
        git branch -M main
        git remote add origin https://github.com/IshanRout/Swagger-codegen.git
        git push -u origin main*/

/*Enables default Spring MVC configuration and registers
  Spring MVC infrastructure components expected by the DispatcherServlet .*/
@EnableWebMvc
@SpringBootApplication
/* The @EnableSwagger2 annotation is used to enable the Swagger2 for your Spring Boot application. */
@EnableSwagger2
@Configuration
public class SwaggerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SwaggerApplication.class, args);
    }

    /*A docket is an object that contains all the customizable
    properties you set and is used by Swagger to generate the documentation.*/
    public Docket apis(){
        return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build()
                .pathMapping("/");}

}
