package me._24_compound.hf;

import java.util.ArrayList;
import java.util.Iterator;

// Composite Pattern
public class Flock implements Quackable {
    ArrayList<Quackable> quackers = new ArrayList<>();
    ArrayList<Observer> observers = new ArrayList<>();
    Observalble observalble;

    public Flock() {
        this.observalble = new Observalble(this);
    }

    public void add(Quackable quacker) {
        this.quackers.add(quacker);
    }

    // Iterator Pattern
    @Override
    public void quack() {
        Iterator<Quackable> iterator = quackers.iterator();
        while (iterator.hasNext()) {
            Quackable quacker = iterator.next();
            quacker.quack();
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        Iterator<Quackable> iterator = quackers.iterator();
        while (iterator.hasNext()) {
            Quackable quacker = iterator.next();
            quacker.registerObserver(observer);
        }
    }

    @Override
    public void notifyObserver() {
    }
}
