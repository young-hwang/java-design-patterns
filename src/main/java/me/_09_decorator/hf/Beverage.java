package me._09_decorator.hf;

public abstract class Beverage {
    String description = "Unknown Beverage";

    public enum Size {
        TALL, GRANDE, VENTI;
    }

    Size size;

    public String getDescription() {
        return description;
    }

    public abstract double cost();

    public Size getSize() {
        return size;
    }
}
