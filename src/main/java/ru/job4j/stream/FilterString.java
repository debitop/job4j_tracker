package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;

public class FilterString {
    public static List<String> filter(List<String> data) {
        return data.stream()
                .filter(x -> x.startsWith("A"))
                .filter(x -> x.endsWith(".java"))
                .collect(Collectors.toList());
    }
}