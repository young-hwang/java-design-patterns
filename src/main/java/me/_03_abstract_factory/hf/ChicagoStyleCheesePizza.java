package me._03_abstract_factory.hf;

public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
//        name = "Chicago Style Deep Dish Cheese Pizza";
//        dough = "Extra Thick Crust Dough";
//        sauce = "Plum tomato Sauce";
//        toppings.add("Shredded Mozzarella Cheese");
    }

    @Override
    void prepare() {

    }

    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
