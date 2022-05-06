package ru.job4j.lambda;

import java.util.function.Function;

public class FunctionFormula {

    public static double calculate(double x) {
 //       Function<Double, Double> func;
        return calculate(num -> num * num + 2 * num + 1, x);
    }

    public static double calculate(Function<Double, Double> y, double x) {
        return y.apply(x);
    }

}