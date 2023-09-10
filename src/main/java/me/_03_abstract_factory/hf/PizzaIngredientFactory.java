package me._03_abstract_factory.hf;

public interface PizzaIngredientFactory {

    public Dough createDough();

    public Sauce createSauce();

    public Cheese createCheese();

    public Veggies[] createVegges();

    public Clams createClam();

}
