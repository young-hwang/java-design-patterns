package io.github.younghwang.gofbasic._17_mediator._01_before;

public class Restraurant {
    private CleaningService cleanService = new CleaningService();

    public void dinner(Guest guest) {
        System.out.println("dinner " + guest);
    }

    public void clean() {
        cleanService.clean(this);
    }
}
