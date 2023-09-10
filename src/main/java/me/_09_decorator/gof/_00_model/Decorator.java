package me._09_decorator.gof._00_model;

public class Decorator implements Component {
    private Component wrappee;

    @Override
    public void operation() {
        this.wrappee.operation();
    }
}
