package me._24_compound.hf;

public class MallardDuck implements Quackable {
    Observalble observalble;

    public MallardDuck() {
        this.observalble = new Observalble(this);
    }

    @Override
    public void quack() {
        System.out.println("Quack");
        this.notifyObserver();
    }

    @Override
    public void registerObserver(Observer observer) {
        observalble.registerObserver(observer);
    }

    @Override
    public void notifyObserver() {
        observalble.notifyObserver();
    }
}
