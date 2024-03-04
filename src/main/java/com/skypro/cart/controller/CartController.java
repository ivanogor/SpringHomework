package com.skypro.cart.controller;

import com.skypro.cart.model.Item;
import com.skypro.cart.service.CartService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CartController {
    private final CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @GetMapping("/add")
    public void add(@RequestParam(value = "index") List<Integer> indexes) {
        cartService.addToCart(indexes);
    }

    @GetMapping("/get")
    public List<Item> get() {
        return cartService.getItemsInCart();
    }

}
