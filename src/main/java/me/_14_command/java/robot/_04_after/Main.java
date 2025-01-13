package me._14_command.java.robot._04_after;

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
