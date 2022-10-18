package io.younghwang.javadesignpattern.simplepizza;

public interface PizzaIngredientFactory {

    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Vegges[] createVegges;
    public Clams createClam;

}
