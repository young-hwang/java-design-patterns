package me._07_bridge.gof._01_before;

public class Client {
    public static void main(String[] args) {
        Champion kdaAhri = new KDAAhri();
        kdaAhri.skillQ();
        kdaAhri.skillR();
    }
}
