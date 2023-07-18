package io.github.younghwang.hfdesignpattern.weatherorama;

public interface Subject {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObserver();
}
