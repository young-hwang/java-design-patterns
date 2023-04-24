package io.younghwang.basemodel._21_strategy._03_after;

public class Client {
    public static void main(String[] args) {
        BlueLightRedLight blueLightRedLight = new BlueLightRedLight();
        // Method 의 Parmeter 로 객체를 받음
        blueLightRedLight.blueLight(new Normal());
        blueLightRedLight.redLight(new Normal());
    }
}
