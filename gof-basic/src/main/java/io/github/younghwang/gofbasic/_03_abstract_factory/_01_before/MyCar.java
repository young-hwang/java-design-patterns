package io.github.younghwang.gofbasic._03_abstract_factory._01_before;

public class MyCar implements Car {
    private MyEngine engine;
    private MyWheel wheel;

    @Override
    public void setWheel(MyWheel wheel) {
        this.wheel = wheel;
    }

    @Override
    public void setEngine(MyEngine engine) {
        this.engine = engine;
    }
}
