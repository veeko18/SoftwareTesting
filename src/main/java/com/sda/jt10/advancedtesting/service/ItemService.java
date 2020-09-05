package com.sda.jt10.advancedtesting.service;

import com.sda.jt10.advancedtesting.model.Item;
import com.sda.jt10.advancedtesting.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ItemService {


    // constructor injection of itemRepository
    private ItemRepository itemRepository;

    @Autowired
    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public Double calculateItemVAT(int id) {

        // search inside database for id
        Item foundItem = itemRepository.findItem(id);
        // once item with id is found
        // get the price
        int price = foundItem.getPrice();
        // calculate the vat
        return price * 0.2;
    }

    // would return a list of each item VAT value
    public List<Double> calculateAllItemsVAT() {
        List<Item> items = itemRepository.findAll();
        return items.stream()
                // here we map each item inside the list to its VAT
                .map(i -> i.getPrice() * 0.2)
                .collect(Collectors.toList());
    }
}
