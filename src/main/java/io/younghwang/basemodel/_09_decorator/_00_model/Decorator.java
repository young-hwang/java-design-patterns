package io.younghwang.basemodel._09_decorator._00_model;

public class Decorator implements Component {
    private Component wrappee;

    @Override
    public void operation() {
        this.wrappee.operation();
    }
}
