package me._20_state.gof._00_model;

public class Context {
    private State state;

    public Context(State state) {
        this.state = state;
    }

    public void changeState(State state) {
        this.state = state;
    }

    public void operation() {
        state.operation();
    }
}
