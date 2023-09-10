package me._17_mediator._01_before;

public class CleaningService {
    public void clean(Gym gym) {
        System.out.println("clean " + gym);
    }

    public void getTower(Guest guest, int numberOfTower) {
        System.out.println(numberOfTower + " towers to " + guest);
    }

    public void clean(Restraurant restraurant) {
        System.out.println("clean " + restraurant);
    }
}
