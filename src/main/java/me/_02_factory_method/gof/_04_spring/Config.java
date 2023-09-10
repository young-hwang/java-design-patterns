package me._02_factory_method.gof._04_spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public String hello() {
        return "hello";
    }
}
