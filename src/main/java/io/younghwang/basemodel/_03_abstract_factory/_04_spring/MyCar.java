package io.younghwang.basemodel._03_abstract_factory._04_spring;


public class MyCar implements Car {
    private String name;

    public MyCar(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
