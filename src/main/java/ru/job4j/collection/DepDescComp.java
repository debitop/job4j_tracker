package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String[] dataLeft = o1.split("/");
        String[] dataRight = o2.split("/");
        int rsl = Integer.compare(dataLeft.length, dataRight.length);
        int length = Math.min(dataLeft.length, dataRight.length);

        for (int i = 0; i < length; i++) {
            int strCompare;
            if (i == 0) {
                strCompare = dataRight[i].compareTo(dataLeft[i]);
            } else {
                strCompare = dataLeft[i].compareTo(dataRight[i]);
            }

            if (strCompare != 0) {
                rsl = strCompare;
                break;
            }
        }
        return rsl;
    }
}
