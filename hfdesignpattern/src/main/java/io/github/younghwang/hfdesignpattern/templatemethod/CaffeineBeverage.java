package io.github.younghwang.hfdesignpattern.templatemethod;

public abstract class CaffeineBeverage {
    public final void prepareReceipt() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    public abstract void brew();

    public abstract void addCondiments();

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }

    private void boilWater() {
        System.out.println("Boiling water");
    }
}
