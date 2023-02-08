package ru.job4j.tracker;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ItemsDescSorter {
    public static void main(String[] args) {
        List<Item> items = Arrays.asList(
                new Item(4, "Fix bugs"),
                new Item(2, "Impl task"),
                new Item(1, "Reboot server")
        );
        System.out.println(items);
        items.sort(new ItemDescByName());
        System.out.println(items);
    }
}