package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int rsl = 0;
        int index = left.length() > right.length() ? right.length() : left.length();
        for (int i = 0; i < index; i++) {
            rsl = Character.compare(left.charAt(i), right.charAt(i));
            if (rsl != 0) {
                return rsl;
            }
        }
        if (left.length() != right.length()) {
            return Integer.compare(left.length(), right.length());
        }
        return rsl;
    }
}
