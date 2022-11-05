package io.younghwang.javadesignpattern.basemodel._01_singleton._10_spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    @Bean
    public String hello() {
        return "Hello";
    }
}
