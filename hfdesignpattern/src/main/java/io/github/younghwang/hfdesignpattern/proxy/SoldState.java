package io.github.younghwang.hfdesignpattern.proxy;

public class SoldState implements State {
    private static final Long serialVersionUID = 4L;
    transient GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Please wait, we're already giving you a gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry, you alread turned the crank");
    }

    @Override
    public void turnCrank() {
        System.out.println("Turning twice doesn't get you another gumball!");
        this.gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void dispense() {
        this.gumballMachine.releaseBall();
        if (this.gumballMachine.getCount() > 0) {
            this.gumballMachine.setState(this.gumballMachine.getNoQuarterState());
        } else {
            System.out.println("Oops, out of gumballs");
            this.gumballMachine.setState(this.gumballMachine.getSoldOutState());
        }
    }

}
