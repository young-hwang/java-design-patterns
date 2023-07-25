package io.github.younghwang.hfdesignpattern.command;

public class CeilingFan {
    public final static int HIGH = 3;
    public final static int MEDIUM = 2;
    public final static int LOW = 1;
    public final static int OFF = 0;
    private String location;
    private int speed;

    public CeilingFan(String location) {
        this.location = location;
        speed = OFF;
    }

    public void high() {
        this.speed = HIGH;
    }

    public void medium() {
        this.speed = MEDIUM;
    }

    public void low() {
        this.speed = LOW;
    }

    public void off() {
        this.speed = OFF;
    }

    public int getSpeed() {
        return speed;
    }
}
