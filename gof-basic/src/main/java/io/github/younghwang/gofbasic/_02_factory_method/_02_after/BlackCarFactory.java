package io.github.younghwang.gofbasic._02_factory_method._02_after;

public class BlackCarFactory implements CarFactory {
    @Override
    public Car createCar(String name) {
        return new BlackCar();
    }
}