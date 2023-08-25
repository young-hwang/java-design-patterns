package io.github.younghwang.hfdesignpattern.proxy;

public class GumballMachine {
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State winnerState;
    State state;
    int count = 0;
    String location;

    public GumballMachine(String location, int count) {
        this.soldOutState = new SoldOutState(this);
        this.noQuarterState = new NoQuarterState(this);
        this.hasQuarterState = new HasQuarterState(this);
        this.soldState = new SoldOutState(this);
        this.winnerState = new WinnerState(this);

        this.count = count;
        if (count > 0) {
            this.state = this.noQuarterState;
        } else {
            this.state = this.soldOutState;
        }
        this.location = location;
    }

    public void insertQuarter() {
        this.state.insertQuarter();
    }

    public void ejectQuarter() {
        this.state.ejectQuarter();
    }

    public void turnCrank() {
        this.state.turnCrank();
        this.state.dispense();
    }

    @Override
    public String toString() {
        return "GumballMachine{" +
                "state=" + state +
                ", count=" + count +
                '}';
    }

    public State getHasQuarterState() {
        return this.hasQuarterState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public String getLocation() {
        return location;
    }

    public void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (this.count != 0) {
            this.count -= 1;
        }
    }

    public int getCount() {
        return count;
    }
}
