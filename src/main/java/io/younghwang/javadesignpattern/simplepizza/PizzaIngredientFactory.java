package io.younghwang.javadesignpattern.simplepizza;

public interface PizzaIngredientFactory {

    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVegges();
    public Clams createClam();

}
