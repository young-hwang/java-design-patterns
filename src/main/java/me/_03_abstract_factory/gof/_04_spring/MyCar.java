package me._03_abstract_factory.gof._04_spring;


public class MyCar implements Car {
    private String name;

    public MyCar(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
