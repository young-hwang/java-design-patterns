package io.github.younghwang.hfdesignpattern.proxy;

public interface State {
    void insertQuarter();

    void ejectQuarter();

    void turnCrank();

    void dispense();
}
