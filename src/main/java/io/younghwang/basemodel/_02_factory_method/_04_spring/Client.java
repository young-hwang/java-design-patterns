package io.younghwang.basemodel._02_factory_method._04_spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        String hi = context.getBean("hello", String.class);
        System.out.println(hi);
    }
}
