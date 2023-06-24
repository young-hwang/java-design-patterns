package io.younghwang.basemodel._02_factory_method._04_spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public String hello() {
        return "hello";
    }
}
