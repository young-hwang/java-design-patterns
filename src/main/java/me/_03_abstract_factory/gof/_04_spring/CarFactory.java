package me._03_abstract_factory.gof._04_spring;

import org.springframework.beans.factory.FactoryBean;

public class CarFactory implements FactoryBean<Car> {
    @Override
    public Car getObject() throws Exception {
        return new MyCar("young");
    }

    @Override
    public Class<?> getObjectType() {
        return Car.class;
    }
}
