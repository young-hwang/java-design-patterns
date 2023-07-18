package io.github.younghwang.hfdesignpattern.simplepizza;

public class CheesePizza extends Pizza {
    private PizzaIngredientFactory ingredientFactory;

    public CheesePizza() {
    }

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}
