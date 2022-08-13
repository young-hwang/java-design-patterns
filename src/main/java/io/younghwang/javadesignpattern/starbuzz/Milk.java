package io.younghwang.javadesignpattern.starbuzz;

public class Milk extends CondimentDecorator {
    Beverage beverage;

    @Override
    public Float cost() {
        return super.cost();
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }
}
