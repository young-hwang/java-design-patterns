package io.github.younghwang.hfdesignpattern.templatemethod;

public class Coffee extends CaffeineBeverage {
    public void prepareReceipt() {
        boilWater();
        brewCoffeeGrinds();
        pourInCup();
        addSugarAndMild();
    }

    private void addSugarAndMild() {
        System.out.println("Adding Sugar and Milk");
    }

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }

    private void brewCoffeeGrinds() {
        System.out.println("Dripping Coffee through filter");
    }

    private void boilWater() {
        System.out.println("Boiling water");
    }
}
