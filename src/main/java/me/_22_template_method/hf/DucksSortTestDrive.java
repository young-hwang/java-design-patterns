package me._22_template_method.hf;

import java.util.Arrays;

public class DucksSortTestDrive {
    public static void main(String[] args) {
        Duck[] ducks = {
                new Duck("A", 3),
                new Duck("B", 1),
                new Duck("C", 2),
                new Duck("D", 5),
                new Duck("E", 4),
        };

        System.out.println("Before sorting");
        display(ducks);
        Arrays.sort(ducks);
        System.out.println("After sorting");
        display(ducks);
    }

    private static void display(Duck[] ducks) {
        Arrays.stream(ducks).forEach(System.out::println);
    }
}
