package io.github.younghwang.hfdesignpattern.weatherorama;

import java.util.Observable;
import java.util.Observer;

public class ThirdPartyDisplay implements Observer, DisplayElement {
    Observable observable;
    private float temperature;
    private float humidity;
    private float pressure;

    public ThirdPartyDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Third party display: " + this.temperature + "F degree and " + this.humidity + "% humidity");
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            this.temperature = temperature;
            this.humidity = humidity;
            this.pressure = pressure;
            display();
        }
    }
}
