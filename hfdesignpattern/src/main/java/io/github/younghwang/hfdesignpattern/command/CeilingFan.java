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
        System.out.println("HIGH");
    }

    public void medium() {
        this.speed = MEDIUM;
        System.out.println("MEDIUM");
    }

    public void low() {
        this.speed = LOW;
        System.out.println("LOW");
    }

    public void off() {
        this.speed = OFF;
        System.out.println("OFF");
    }

    public int getSpeed() {
        return speed;
    }
}
