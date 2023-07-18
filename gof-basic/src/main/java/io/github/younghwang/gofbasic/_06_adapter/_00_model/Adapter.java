package io.github.younghwang.gofbasic._06_adapter._00_model;

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
