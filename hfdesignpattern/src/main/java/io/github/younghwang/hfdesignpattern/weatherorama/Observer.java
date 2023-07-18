package io.github.younghwang.hfdesignpattern.weatherorama;

public interface Observer {
    void update(float temperature, float humidity, float pressure);
}
