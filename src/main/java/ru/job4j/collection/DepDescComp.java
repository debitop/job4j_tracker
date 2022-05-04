package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String[] dataLeft = o1.split("/");
        String[] dataRight = o2.split("/");
        int rsl = dataRight[0].compareTo(dataLeft[0]);
        return rsl != 0 ? rsl : o1.compareTo(o2);
    }
}

