package me._02_factory_method.gof._00_model;

public interface Creator {
    default void doSomething() {
        createProduct();
    }

    Product createProduct();
}
