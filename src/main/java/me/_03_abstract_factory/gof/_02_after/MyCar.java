package me._03_abstract_factory.gof._02_after;


public class MyCar implements Car {
    private Engine engine;
    private Wheel wheel;

    @Override
    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    public Wheel getWheel() {
        return wheel;
    }
}
