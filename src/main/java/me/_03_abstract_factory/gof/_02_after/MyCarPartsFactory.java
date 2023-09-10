package me._03_abstract_factory.gof._02_after;

public class MyCarPartsFactory implements CarPartsFactory {
    @Override
    public Wheel createWheel() {
        return new MyWheel();
    }

    @Override
    public Engine createEngine() {
        return new MyEngine();
    }
}
