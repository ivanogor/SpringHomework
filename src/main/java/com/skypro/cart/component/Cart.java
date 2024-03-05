package com.skypro.cart.component;

import com.skypro.cart.model.Item;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@SessionScope
@Component
public class Cart {
    private final List<Item> items = new ArrayList<>();

    public List<Item> getItems() {
        return items;
    }
}
