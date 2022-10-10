package io.younghwang.javadesignpattern.simplepizza;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStylePizzaStore = new NYStylePizzaStore();
        PizzaStore chicagoPizzaStypeStore = new ChicagoPizzaStypeStore();

        Pizza pizza = nyStylePizzaStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoPizzaStypeStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
}
