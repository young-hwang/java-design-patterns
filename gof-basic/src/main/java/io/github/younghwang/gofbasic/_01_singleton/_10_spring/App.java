package io.github.younghwang.gofbasic._01_singleton._10_spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * spring singleton 필요 시 bean 등록하여 사용
 * singleton pattern 아님
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        String hello1 = context.getBean("hello", String.class);
        String hello2 = context.getBean("hello", String.class);
        System.out.println(hello1 == hello2);
    }
}
