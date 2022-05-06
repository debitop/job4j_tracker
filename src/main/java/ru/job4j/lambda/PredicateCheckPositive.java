package ru.job4j.lambda;

import java.util.function.Predicate;

public class PredicateCheckPositive {

    public static boolean check(int num) {
//        Predicate<Integer> pred = s -> s > 0;
//        return check(pred, num);
        return check(s -> s > 0, num);
    }

    private static boolean check(Predicate<Integer> predicate, int num) {
        return predicate.test(num);
    }
}