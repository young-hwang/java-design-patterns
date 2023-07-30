package io.github.younghwang.hfdesignpattern.Adaptive;

import java.security.cert.TrustAnchor;

public class DuckTestDrive {
    public static void main(String[] args) {
        MallarDuck mallarDuck = new MallarDuck();
        WildTurkey wildTurkey = new WildTurkey();

        Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);

        System.out.println("The Turkey says...");
        wildTurkey.gobble();
        wildTurkey.fly();

        System.out.println("\nThe Duck says ...");
        testDuck(mallarDuck);

        System.out.println("\nThe TurkeyAdapter says ...");
        testDuck(turkeyAdapter);
    }

    private static void testDuck(Duck mallarDuck) {
        mallarDuck.quack();
        mallarDuck.fly();
    }
}
