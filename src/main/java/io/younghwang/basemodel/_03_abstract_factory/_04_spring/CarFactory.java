package io.younghwang.basemodel._03_abstract_factory._04_spring;

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
