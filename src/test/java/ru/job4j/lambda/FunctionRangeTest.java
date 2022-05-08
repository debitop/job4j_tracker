package ru.job4j.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;


public class FunctionRangeTest {

    @Test
    public void whenLinearFunctionThenLinearResults() {
        FunctionRange function = new FunctionRange();
        List<Double> result = function.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenQuadraticFunctionThenLinearResults() {
        FunctionRange function = new FunctionRange();
        List<Double> result = function.diapason(5, 8, x -> x * x + 2 * x + 1);

        List<Double> expected = Arrays.asList(36D, 49D, 64D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenExponentialFunctionThenLinearResults() {
        FunctionRange function = new FunctionRange();
        List<Double> result = function.diapason(5, 8, x -> Math.pow(2, x) + 1);
        List<Double> expected = Arrays.asList(33D, 65D, 129D);
        assertThat(result, is(expected));
    }
}