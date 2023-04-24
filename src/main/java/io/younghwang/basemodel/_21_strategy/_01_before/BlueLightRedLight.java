package io.younghwang.basemodel._21_strategy._01_before;

public class BlueLightRedLight {
    private int speed;

    public BlueLightRedLight(int speed) {
        this.speed = speed;
    }

    public void blueLight() {
        if (speed == 1) {
            System.out.println("무 궁 화 꽃 이 ");
        } else if (speed == 2) {
            System.out.println("무  궁  화  꽃  이  ");
        } else if (speed == 3) {
            System.out.println("무   궁   화   꽃   이   ");
        }
    }

    public void redLight() {
        if (speed == 1) {
            System.out.println("피 었 습 니 다 ");
        } else if (speed == 2) {
            System.out.println("피  었  습  니  다  ");
        } else if (speed == 2) {
            System.out.println("피   었   습   니   다   ");
        }
    }
}
