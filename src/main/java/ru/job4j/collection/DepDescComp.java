package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int rsl = 0;
        String[] leftData = left.split("/");
        String[] rightData = right.split("/");
        rsl = rightData[0].compareTo(leftData[0]);
        return (rsl == 0) ? left.compareTo(right) : rsl;
    }
}