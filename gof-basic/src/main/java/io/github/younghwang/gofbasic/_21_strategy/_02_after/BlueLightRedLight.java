package io.github.younghwang.gofbasic._21_strategy._02_after;

public class BlueLightRedLight {
    private Speed speed;

    public BlueLightRedLight(Speed speed) {
        this.speed = speed;
    }

    public void blueLight() {
        speed.blueLight();
    }

    public void redLight() {
        speed.redLight();
    }
}
