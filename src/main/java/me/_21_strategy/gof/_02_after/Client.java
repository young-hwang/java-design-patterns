package me._21_strategy.gof._02_after;


public class Client {
    public static void main(String[] args) {
        // Constructor 의 Parmeter 로 객체를 받음
        BlueLightRedLight blueLightRedLight = new BlueLightRedLight(new Fast());
        blueLightRedLight.blueLight();
        blueLightRedLight.redLight();
    }
}
