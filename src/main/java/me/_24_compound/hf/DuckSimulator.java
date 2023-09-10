package me._24_compound.hf;

import io.github.younghwang.hfdesignpattern.adaptive.Duck;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator duckSimulator = new DuckSimulator();
        CountingDuckFactory countingDuckFactory = new CountingDuckFactory();
        duckSimulator.simulate(countingDuckFactory);
    }

    private void simulate(CountingDuckFactory countingDuckFactory) {
        Quackable mallardDuck = countingDuckFactory.createMallardDuck();
        Quackable redHeadDuck = countingDuckFactory.createRedHeadDuck();
        Quackable duckCall = countingDuckFactory.createDuckCall();
        Quackable rubberDuck = countingDuckFactory.createRubberDuck();
        Quackable gooseAdapter = new GooseAdapter(new Goose());

        System.out.println("\nDuck Simulator");

        Flock flockOfDucks = new Flock();

        flockOfDucks.add(mallardDuck);
        flockOfDucks.add(redHeadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(gooseAdapter);

        Flock flockOfMallards = new Flock();

        flockOfMallards.add(countingDuckFactory.createMallardDuck());
        flockOfMallards.add(countingDuckFactory.createMallardDuck());
        flockOfMallards.add(countingDuckFactory.createMallardDuck());
        flockOfMallards.add(countingDuckFactory.createMallardDuck());

        flockOfDucks.add(flockOfMallards);

        System.out.println("Whole flock simulation");
        simulate(flockOfDucks);

        System.out.println("Mallard ducks simulation");
        simulate(flockOfMallards);

        System.out.println("The ducks quacked " + QuackCounter.getNumberOfQuacks() + " times");
    }

    private void simulate() {
        MallardDuck mallardDuck = new MallardDuck();
        RedHeadDuck redHeadDuck = new RedHeadDuck();
        DuckCall duckCall = new DuckCall();
        RubberDuck rubberDuck = new RubberDuck();
        GooseAdapter gooseAdapter = new GooseAdapter(new Goose());

        System.out.println("\nDuck Simulator");

        simulate(new QuackCounter(mallardDuck));
        simulate(new QuackCounter(redHeadDuck));
        simulate(new QuackCounter(duckCall));
        simulate(new QuackCounter(rubberDuck));
        simulate(gooseAdapter);

        System.out.println("The ducks quacked " + QuackCounter.getNumberOfQuacks() + " times");
    }

    private void simulate(Quackable duck) {
        duck.quack();
    }
}
