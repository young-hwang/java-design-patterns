package me._03_abstract_factory.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FactoryBeanConfig {

    @Bean
    public CarFactory carFactory() {
        return new CarFactory();
    }
}
