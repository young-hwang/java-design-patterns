package io.younghwang.javadesignpattern.weatherorama;

public interface Subject {
    void registerObserver();
    void removeObserver();
    void notifyObserver();
}
