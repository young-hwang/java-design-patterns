package me._11_flyweight._00_model;

public class FlyweightFactory {
    private Flyweight[] cache;

    public Flyweight getFlyweight(String intrinsitState) {
        return cache[0];
    }
}
