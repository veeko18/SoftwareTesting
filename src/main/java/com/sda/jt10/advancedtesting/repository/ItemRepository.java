package com.sda.jt10.advancedtesting.repository;

import com.sda.jt10.advancedtesting.model.Item;

import java.util.List;

public interface ItemRepository {
    Item findItem(int id);

    List<Item> findAll();
}
