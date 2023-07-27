package io.github.younghwang.hfdesignpattern.command;

public class Hottub {
    private int temperature;

    public void on() {
        System.out.println("Hot tub On");
    }

    public void off() {
        System.out.println("Hot tub Off");
    }

    public void circulate() {
        System.out.println("Hot tub circulate");
    }

    public void jetsOn() {
        System.out.println("Hot tub Jets On");
    }

    public void jetsOff() {
        System.out.println("Hot tub Jets Off");
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println("Hot tub set temperature " + this.temperature);
    }
}
