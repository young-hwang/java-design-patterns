package io.younghwang.javadesignpattern.starbuzz;

public class Beverage {
    String description;
    String milk;
    String soy;
    String mocha;
    String whip;

    public String getDescription() {
        return description;
    }

    public Float cost() {
        return 0f;
    }

    public boolean hasMilk() {
        return true;
    }

    public void setMilk(String milk) {
        this.milk = milk;
    }

    public void setSoy(String soy) {
        this.soy = soy;
    }

    public void setMocha(String mocha) {
        this.mocha = mocha;
    }

    public void setWhip(String whip) {
        this.whip = whip;
    }
}
