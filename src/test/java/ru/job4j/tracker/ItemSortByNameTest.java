package ru.job4j.tracker;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class ItemSortByNameTest {

    @Test
    public void itemSortByNameAcs() {
        List<Item> items = Arrays.asList(new Item("one"), new Item("two"), new Item("five"));
        Collections.sort(items, new ItemAscByName());
        List<Item> expected = Arrays.asList(new Item("five"), new Item("one"), new Item("two"));
        assertEquals(items, expected);
    }

    @Test
    public void itemSortByNameDesc() {
        List<Item> items = Arrays.asList(new Item("one"), new Item("two"), new Item("five"));
        Collections.sort(items, new ItemDescByName());
        List<Item> expected = Arrays.asList(new Item("two"), new Item("one"), new Item("five"));
        assertEquals(items, expected);
    }
}