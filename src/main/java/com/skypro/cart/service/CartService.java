package com.skypro.cart.service;

import com.skypro.cart.model.Assortment;
import com.skypro.cart.model.Item;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//@SessionScope
@Service
public class CartService {
    private List<Item> itemsInCart = new ArrayList<>();
    public void addToCart(int... indexes) {
        for (int index : indexes) {
            try {
                itemsInCart.add(Assortment.getItem(index));
            }
            catch (IndexOutOfBoundsException e) {
                System.out.println(index + " - данный индекс не подходит.");
            }
        }
    }

    public List<Item> getItemsInCart() {
        return itemsInCart;
    }
}
