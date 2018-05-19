package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by 11369 on 2018/5/6.
 */
@org.springframework.boot.autoconfigure.SpringBootApplication
@EnableAutoConfiguration
@EnableWebMvc
public class SpringBootApplication {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringBootApplication.class, args);
    }
}
