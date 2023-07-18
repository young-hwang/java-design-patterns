package io.github.younghwang.gofbasic._17_mediator._02_after;

import java.time.LocalDateTime;

public class FrontDesk {
    private CleaningService cleaningService = new CleaningService();
    private Restaurant restraurant = new Restaurant();

    public void getTowers(Guest guest, int numberOfTowers) {
        this.cleaningService.getTowers(guest.getId(), numberOfTowers);
    }

    public String getRoomNumber(Integer guestId) {
        return "111";
    }

    public void getDinner(Guest guest, LocalDateTime dateTime) {
        this.restraurant.makeDinner(guest.getId(), dateTime);
    }
}
