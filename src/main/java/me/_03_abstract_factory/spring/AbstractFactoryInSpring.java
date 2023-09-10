package me._03_abstract_factory.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AbstractFactoryInSpring {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(FactoryBeanConfig.class);
        CarFactory bean = context.getBean(CarFactory.class);
        System.out.println(bean);

        Car car = context.getBean(Car.class);
        System.out.println(car);
    }
}
