package com.skypro.cart.service;

import com.skypro.cart.component.Cart;
import com.skypro.cart.repository.Assortment;
import com.skypro.cart.model.Item;
import org.springframework.stereotype.Service;
import java.util.Collections;
import java.util.List;


@Service
public class CartService {
    private final Cart cart;
    private final Assortment assortment;

    public CartService(Cart cart, Assortment assortment) {
        this.cart = cart;
        this.assortment = assortment;
    }

    public void addToCart(List<Integer> indexes) {
        for (int index : indexes) {
            try {
                cart.addItems(assortment.getItem(index));
            }
            catch (IndexOutOfBoundsException e) {
                System.out.println(index + " - данный индекс не подходит.");
            }
        }
    }

    public List<Item> getItemsInCart() {
        return Collections.unmodifiableList(cart.getItems());
    }
}
