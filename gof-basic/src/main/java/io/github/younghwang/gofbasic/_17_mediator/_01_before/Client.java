package io.github.younghwang.gofbasic._17_mediator._01_before;

public class Client {
    public static void main(String[] args) {
        Guest guest = new Guest();
        guest.getTower(3);
        guest.dinner();

        Restraurant restraurant = new Restraurant();
        restraurant.clean();
    }
}
