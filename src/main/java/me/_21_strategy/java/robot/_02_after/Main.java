package me._21_strategy.java.robot._02_after;

public class Main {
    public static void main(String[] args) {
        Robot jervis = new Robot("Jervis");
        System.out.println(jervis);

        jervis.execute("forward right forward");
        System.out.println(jervis);

        jervis.execute("left backward left forward");
        System.out.println(jervis);

        jervis.execute("right forward forward farward");
        System.out.println(jervis);
    }
}
