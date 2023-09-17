package me._24_compound.hf;

public class Quackologist implements Observer {
    @Override
    public void update(QuackObservable duck) {
        System.out.println("Quacklogist: " + duck + " just quacked.");
    }
}
