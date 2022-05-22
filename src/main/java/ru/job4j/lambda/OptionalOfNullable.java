package ru.job4j.lambda;

import java.util.List;
import java.util.Optional;

public class OptionalOfNullable {
    public static Optional<String> findValue(List<String> strings, String value) {
        Optional<String> op = Optional.empty();
        for (String s : strings) {
            if (Optional.ofNullable(value).equals(Optional.ofNullable(s))) {
                op = Optional.ofNullable(s);
                break;
            }
        }
        return op;
    }
}
