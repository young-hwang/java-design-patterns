package io.younghwang.javadesignpattern.weatherorama;

public class ThirdPartyDisplay implements Observer, DisplayElement{

    private float temperature;
    private float humidity;
    private float pressure;

    @Override
    public void display() {
        System.out.println("Third party display: " + this.temperature + "F degree and " + this.humidity + "% humidity");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
