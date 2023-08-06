package io.github.younghwang.hfdesignpattern.templatemethod;

public class Tea extends CaffeineBeverage {
    @Override
    public void brew() {
        System.out.println("Pouring into cup");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding Lemon");
    }
}
