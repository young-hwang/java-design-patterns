package me._21_strategy._04_after;

public class Client {
    public static void main(String[] args) {
        BlueLightRedLight blueLightRedLight = new BlueLightRedLight(new Speed() {
            @Override
            public void blueLight() {
                System.out.println("무 궁 화 꽃 이 ");
            }

            @Override
            public void redLight() {
                System.out.println("피 었 습 니 다 ");
            }
        });

        // Method 의 Parmeter 로 객체를 받음
        blueLightRedLight.blueLight();
        blueLightRedLight.redLight();
    }
}
