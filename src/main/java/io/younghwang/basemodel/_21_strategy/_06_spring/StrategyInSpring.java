package io.younghwang.basemodel._21_strategy._06_spring;

import org.springframework.beans.factory.xml.BeanDefinitionParser;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class StrategyInSpring {
    public static void main(String[] args) {
        ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext();
        ApplicationContext fileSystemXmlApplicationContext = new FileSystemXmlApplicationContext();
        ApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();

        BeanDefinitionParser parser;
    }
}
