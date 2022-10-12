package com.example.homework2dot11.component;

import com.example.homework2dot11.entities.Item;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Component
@SessionScope
public class Cart {
    private final List<Item> items;

    public Cart(List<Item> items) {
        this.items = new ArrayList<>();
    }

    public void add(List<Item> items) {
        this.items.addAll(items);
    }

    public List<Item> get() {
        return new ArrayList<>(items);
    }
}
