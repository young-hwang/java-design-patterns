package io.younghwang.basemodel._12_proxy._05_spring;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class Client {
    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(Client.class);
        springApplication.setWebApplicationType(WebApplicationType.NONE);
        springApplication.run(args);
    }

    @Bean
    public ApplicationRunner applicationRunner(GameService gameService) {
        return args -> gameService.startGame();
    }

}
