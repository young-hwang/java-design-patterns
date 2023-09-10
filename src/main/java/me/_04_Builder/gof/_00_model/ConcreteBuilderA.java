package me._04_Builder.gof._00_model;

public class ConcreteBuilderA implements Builder {
    @Override
    public void buildStepA() {

    }

    @Override
    public void buildStepB() {

    }

    @Override
    public Product getProduce() {
        return new Product();
    }
}
