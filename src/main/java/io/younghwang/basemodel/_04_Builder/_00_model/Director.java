package io.younghwang.basemodel._04_Builder._00_model;

public class Director {
    private Builder builder;

    public Director() {
    }

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public Builder getBuilder() {
        return builder;
    }
}
