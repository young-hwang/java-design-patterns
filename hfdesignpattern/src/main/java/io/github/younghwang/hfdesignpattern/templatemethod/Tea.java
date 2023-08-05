package io.github.younghwang.hfdesignpattern.templatemethod;

public class Tea {
    public void prepareReceipt() {
        boilWater();
        steepTeaBag();
        pourInCup();
        addSugarAndMild();
    }

    private void addSugarAndMild() {
        System.out.println("Adding Sugar and Milk");
    }

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }

    private void steepTeaBag() {
        System.out.println("Steeping the tea");
    }

    private void boilWater() {
        System.out.println("Boiling water");
    }
}
