package me._17_mediator._02_after;

public class CleaningService {
    private FrontDesk frontDesk;

    public void getTowers(Integer guestId, int numberOfTowers) {
        String roomNumber = this.frontDesk.getRoomNumber(guestId);
        System.out.println("provide " + numberOfTowers + " to " + roomNumber);
    }
}
