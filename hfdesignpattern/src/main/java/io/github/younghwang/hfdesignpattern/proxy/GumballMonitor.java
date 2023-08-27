package io.github.younghwang.hfdesignpattern.proxy;

public class GumballMonitor {
    GumballMachine gumballMachine;

    public GumballMonitor(gumballMa gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void report() {
        System.out.println("Gumball Machine: " + gumballMachine.getLocation());
        System.out.println("Current inventory: " + gumballMachine.getCount());
        System.out.println("Current state: " + gumballMachine.getState());
    }
}
