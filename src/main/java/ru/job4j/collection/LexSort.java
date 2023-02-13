package ru.job4j.collection;
import java.util.Comparator;
public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        String[] leftIntOnly = left.split("\\.");
        int leftInt = Integer.parseInt(leftIntOnly[0]);
        String[] rightIntOnly = right.split("\\.");
        int rightInt = Integer.parseInt(rightIntOnly[0]);
        return Integer.compare(leftInt, rightInt);
    }
}

