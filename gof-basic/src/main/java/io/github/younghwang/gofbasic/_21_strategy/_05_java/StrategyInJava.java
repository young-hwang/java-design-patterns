package io.github.younghwang.gofbasic._21_strategy._05_java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class StrategyInJava {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(5);

        System.out.println(numbers);

        Collections.sort(numbers, new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }

        });

        Collections.sort(numbers, Comparator.reverseOrder());
        System.out.println(numbers);

        Collections.sort(numbers, Comparator.naturalOrder());
        System.out.println(numbers);

    }
}
