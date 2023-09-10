package me._21_strategy._00_model;

public class Context {
    private Strategy strategy;

    public void operation() {
        strategy.execute();
    }
}
