package io.github.younghwang.gofbasic._17_mediator._01_before;

public class Guest {
    private Restraurant restraurant = new Restraurant();
    private CleaningService cleaningService = new CleaningService();

    public void dinner() {
        restraurant.dinner(this);
    }

    public void getTower(int numberOfTower) {
        cleaningService.getTower(this, numberOfTower);
    }
}
