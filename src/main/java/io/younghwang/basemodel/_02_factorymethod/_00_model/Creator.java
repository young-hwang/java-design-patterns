package io.younghwang.basemodel._02_factorymethod._00_model;

public interface Creator {
    default void templateMethod() {

    }

    Product createProduct();
}
