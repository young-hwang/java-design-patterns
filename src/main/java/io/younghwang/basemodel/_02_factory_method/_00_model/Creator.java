package io.younghwang.basemodel._02_factory_method._00_model;

public interface Creator {
    default void templateMethod() {

    }

    Product createProduct();
}
