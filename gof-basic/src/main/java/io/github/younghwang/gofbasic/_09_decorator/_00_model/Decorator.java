package io.github.younghwang.gofbasic._09_decorator._00_model;

public class Decorator implements Component {
    private Component wrappee;

    @Override
    public void operation() {
        this.wrappee.operation();
    }
}
