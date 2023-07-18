package io.github.younghwang.hfdesignpattern.simplepizza;

public class ChicagoIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSource();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggies[] createVegges() {
        Veggies[] veggies = {new Spinach(), new SlicedPepperoni(), new EggPlant(), new BlackOlives()};
        return veggies;
    }

    @Override
    public Clams createClam() {
        return new FrozenClam();
    }
}
