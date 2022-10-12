package com.example.homework2dot11.controllers;

import com.example.homework2dot11.entities.Item;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.homework2dot11.services.CartServiceImpl;


import java.util.List;

@RequestMapping("/order")
@RestController
public class CartController {
    private final CartServiceImpl cartServiceImpl;

    public CartController(CartServiceImpl cartServiceImpl) {
        this.cartServiceImpl = cartServiceImpl;
    }


    @GetMapping("/add")
    public void add(@RequestParam("id") List<Integer> ids) {
        cartServiceImpl.add(ids);
    }

    @GetMapping("/get")
    public List<Item> get() {
        return cartServiceImpl.get();
    }
}
