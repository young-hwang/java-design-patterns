package me._02_factory_method.gof._02_after;

public class YellowCarFactory implements CarFactory {
    @Override
    public Car createCar(String name) {
        return new YellowCar();
    }
}
