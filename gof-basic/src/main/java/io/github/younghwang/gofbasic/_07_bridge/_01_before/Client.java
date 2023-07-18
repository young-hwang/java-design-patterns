package io.github.younghwang.gofbasic._07_bridge._01_before;

public class Client {
    public static void main(String[] args) {
        Champion kdaAhri = new KDAAhri();
        kdaAhri.skillQ();
        kdaAhri.skillR();
    }
}
