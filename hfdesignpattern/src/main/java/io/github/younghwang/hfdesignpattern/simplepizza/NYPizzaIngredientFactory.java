package io.github.younghwang.hfdesignpattern.simplepizza;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVegges() {
        Veggies veggies[] = {new Grarlic(), new Onion(), new Mushroom(), new RedPepper()};
        return veggies;
    }

    public Pepperoni createPepperoni() {
        return new SlicePepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshCalm();
    }

}
