package com.skypro.cart.repository;

import com.skypro.cart.model.Item;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

import java.util.List;


@Repository
public class Assortment {
    private final List<Item> itemsInAssortment = new ArrayList<>(List.of(
            new Item("Колбаса", 320),
            new Item("Хлеб", 52),
            new Item("Сыр", 220),
            new Item("Яйца", 135),
            new Item("Молоко", 74))
    );

    public Item getItem(int index) {
        return itemsInAssortment.get(index);
    }
}