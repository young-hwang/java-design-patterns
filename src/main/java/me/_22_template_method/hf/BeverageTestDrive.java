package me._22_template_method.hf;

public class BeverageTestDrive {
    public static void main(String[] args) {
        CoffeeWithHook coffeeWithHook = new CoffeeWithHook();
        System.out.println("Making coffee..");
        coffeeWithHook.prepareRecipe();
    }
}
