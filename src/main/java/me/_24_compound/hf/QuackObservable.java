package me._24_compound.hf;

public interface QuackObservable {
    void registerObserver(Observer observer);

    void notifyObserver();
}
