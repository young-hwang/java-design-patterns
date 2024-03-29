package me._17_mediator.gof._02_after;

import java.time.LocalDateTime;

public class Guest {
    private Integer id;
    private final FrontDesk frontDesk = new FrontDesk();

    public void requestTowers(int numberOfTowers) {
        this.frontDesk.getTowers(this, numberOfTowers);
    }

    public void requestDinner(LocalDateTime dateTime) {
        this.frontDesk.getDinner(this, dateTime);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
