package com.sda.jt10.advancedtesting.repository;

import com.sda.jt10.advancedtesting.model.Item;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class ItemRepositoryImpl implements ItemRepository {
    @Override
    public Item findItem(int id) {
        return new Item(id, "someName", 12, 33);
    }

    @Override
    public List<Item> findAll() {
        Item itemA = new Item(2, "furniture", 300, 1);
        Item itemB = new Item(3, "mobile", 800, 10);
        Item itemC = new Item(4, "laptop", 1200, 6);
        Item itemD = new Item(5, "someName", 12, 33);

        return Arrays.asList(itemA, itemB, itemC);
    }


}
