package com.skypro.cart.controller;

import com.skypro.cart.model.Item;
import com.skypro.cart.service.CartService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/store/order")
public class CartController {
    private final CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @RequestMapping("/add")
    public void add(@RequestParam(value = "index", required = false) int... indexes) {
        cartService.addToCart(indexes);
    }

    @RequestMapping("/get")
    public List<Item> get() {
        return cartService.getItemsInCart();
    }
}
