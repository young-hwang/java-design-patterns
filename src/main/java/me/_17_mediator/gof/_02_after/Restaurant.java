package me._17_mediator.gof._02_after;

import java.time.LocalDateTime;

public class Restaurant {
    private FrontDesk frontDesk;

    public void makeDinner(Integer id, LocalDateTime dateTime) {
        String roomNumber = frontDesk.getRoomNumber(id);
        System.out.println("reservation " + roomNumber + " at " + dateTime);
    }
}
