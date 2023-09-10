package me._09_decorator.hf;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        this.description = "Dark Roast";
    }

    @Override
    public double cost() {
        return .99;
    }
}
