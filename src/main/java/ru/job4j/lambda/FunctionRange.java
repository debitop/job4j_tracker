package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionRange {
    List<Double> list = new ArrayList<>();

    List<Double> diapason(int start, int end, Function<Double, Double> func) {
        for (double i = start; i < end; i++) {
            list.add(func.apply(i));
        }
        return list;
    }
}
