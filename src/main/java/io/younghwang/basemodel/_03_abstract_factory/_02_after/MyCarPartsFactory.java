package io.younghwang.basemodel._03_abstract_factory._02_after;

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
