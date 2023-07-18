package io.github.younghwang.gofbasic._04_Builder._00_model;

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
