package ru.job4j.lambda;

import java.util.function.Predicate;

public class PredicateCheckEven {

    public static boolean check(int num) {
        Predicate<Integer> pred = s -> s % 2 == 0;
        return check(pred, num);
    }

    private static boolean check(Predicate<Integer> predicate, int num) {
        return predicate.test(num);
    }
}
