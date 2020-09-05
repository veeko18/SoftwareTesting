package com.sda.jt10.advancedtesting.controller;

import com.sda.jt10.advancedtesting.model.Item;
import com.sda.jt10.advancedtesting.repository.ItemRepository;
import com.sda.jt10.advancedtesting.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemController {

    @Autowired
    ItemRepository itemRepository;

    @Autowired
    ItemService itemService;

    @GetMapping("/dummy-item")
    public Item dummyItem() {
        return new Item(1, "desk", 10, 23);
    }

    @GetMapping("/item-from-repository/{itemId}")
    public Item itemFromRepository(@PathVariable("itemId") Integer itemId) {

        return itemRepository.findItem(itemId);
    }

    @GetMapping("/item-from-repository/vat/{itemId}")
    public double itemVatFromRepository(@PathVariable("itemId") Integer itemId) {
        return itemService.calculateItemVAT(itemId);
    }

    @GetMapping("/all-items/vat")
    public List<Double> allItemsVat() {
        return itemService.calculateAllItemsVAT();
    }
}
