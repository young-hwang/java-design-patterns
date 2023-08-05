package io.github.younghwang.hfdesignpattern.templatemethod;

public class CaffeineBeverage {
    private void addSugarAndMild() {
        System.out.println("Adding Sugar and Milk");
    }

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }

    private void boilWater() {
        System.out.println("Boiling water");
    }
}
