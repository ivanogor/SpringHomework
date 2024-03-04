package com.skypro.cart.model;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;

import java.util.List;


@Repository
public class Assortment {
    private final static List<Item> items = new ArrayList<>(List.of(
            new Item("Колбаса", 320),
            new Item("Хлеб", 52),
            new Item("Сыр", 220),
            new Item("Яйца", 135),
            new Item("Молоко", 74))
    );

    public static Item getItem(int index) {
        return items.get(index);
    }
}