package io.younghwang.javadesignpattern.weatherorama;

public interface Observer {
    void update(float temperature, float humidity, float pressure);
}
