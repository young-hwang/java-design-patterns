package me._17_mediator.gof._01_before;

public class Restraurant {
    private CleaningService cleanService = new CleaningService();

    public void dinner(Guest guest) {
        System.out.println("dinner " + guest);
    }

    public void clean() {
        cleanService.clean(this);
    }
}
