package me._18_memento._00_model;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    private final List<Memento> mementos = new ArrayList<>();

    public void add(Originator originator) {
        this.mementos.add(originator);
    }
}
