package ru.job4j.lambda;

import java.util.function.Function;

public class FunctionSqrt {

    public static double calculate(double x) {
        Function<Double, Double> func = s -> Math.sqrt(s);
        return calculate(func, x);
    }

    public static double calculate(Function<Double, Double> y, double x) {
        return y.apply(x);
    }

}