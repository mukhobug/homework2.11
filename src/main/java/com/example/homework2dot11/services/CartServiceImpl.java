package com.example.homework2dot11.services;

import com.example.homework2dot11.component.Cart;
import com.example.homework2dot11.entities.Item;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class CartServiceImpl {
    private final Map<Integer, Item> items = new HashMap<>();
    private final Cart cart;

    public CartServiceImpl(Cart cart) {
        this.cart = cart;
    }

    @PostConstruct
    public void init() {
        items.put(1, new Item(1, "watch", 17000));
        items.put(2, new Item(2, "phone", 32000));
        items.put(3, new Item(3, "keyboard", 7000));
        items.put(4, new Item(4, "motherboard", 15000));
    }

    public List<Item> get() {
        return cart.get();
    }

    public void add(List<Integer> ids) {
        cart.add(
                ids.stream()
                        .map(items::get)
                        .collect(Collectors.toList())
        );
    }
}
