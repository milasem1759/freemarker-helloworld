package com.mila_sem.freemarker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan("com.mila_sem.freemarker")
public class SpringBootStandAloneApp {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootStandAloneApp.class, args);
    }
}
