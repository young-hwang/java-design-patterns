package me._06_adapter.gof._00_model;

public class Adapter implements Target {
    private final Adaptee adaptee;

    public Adapter() {
        this.adaptee = new Adaptee();
    }

    @Override
    public void operation() {
        adaptee.specificOperation();
    }
}
