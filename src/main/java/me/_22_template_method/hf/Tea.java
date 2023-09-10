package me._22_template_method.hf;

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
