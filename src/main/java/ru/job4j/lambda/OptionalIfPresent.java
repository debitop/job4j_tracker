package ru.job4j.lambda;

import java.util.Optional;

public class OptionalIfPresent {

    public static void ifPresent(int[] data) {
        max(data).ifPresent(x -> System.out.println("Max: " + x));
    }

    private static Optional<Integer> max(int[] data) {
        if (data.length == 0) {
            return Optional.empty();
        } else {
            int maxData = 0;
            for (int i : data) {
                if (i > maxData) {
                    maxData = i;
                }
            }
            return Optional.of(maxData);
        }
    }
}