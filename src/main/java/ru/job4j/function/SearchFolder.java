package ru.job4j.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SearchFolder {
    public static List<Folder> filter1(List<Folder> list, Predicate<Folder> pred) {
        List<Folder> rsl = new ArrayList<>();
        for (Folder f : list) {
            if (pred.test(f)) {
                rsl.add(f);
            }
        }
        return rsl;
    }

    public static List<Folder> filter2(List<Folder> list, Predicate<Folder> pred) {
        return list.stream().filter(pred).collect(Collectors.toList());
    }
}