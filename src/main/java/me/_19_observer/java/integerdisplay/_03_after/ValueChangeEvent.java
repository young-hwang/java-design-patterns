package me._19_observer.java.integerdisplay._03_after;

public class ValueChangeEvent {
    private final Value source;

    public ValueChangeEvent(Value source) {
        this.source = source;
    }

    public Value getSource() {
        return source;
    }
}
