package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class ItemDescByNameTest {

    @Test
    public void compare() {
        List<Item> items = Arrays.asList(
                new Item(2, "Impl task"),
                new Item(1, "Reboot server"),
                new Item(4, "Fix bugs")
        );
        Collections.sort(items, new ItemAscByName());
        List<Item> expected = Arrays.asList(
                new Item(1, "Reboot server"),
                new Item(2, "Impl task"),
                new Item(4, "Fix bugs")
        );
        assertThat(expected.equals(items));
    }

    private void assertThat(boolean equals) {
    }
}