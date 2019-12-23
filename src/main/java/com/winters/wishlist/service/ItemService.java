package com.winters.wishlist.service;

import com.winters.wishlist.model.Item;
import com.winters.wishlist.model.Person;
import java.util.List;
import java.util.Optional;

public interface ItemService {
    Item createItem(Item item);
    Optional<Item> getItem(Long id);
    Item editItem(Item item);

    void deleteItem(Item item);
    void deleteItem(Long id);

    List<Item> getAllItems(int pageNumber, int pageSize);
    List<Item> getAllItems();

    List<Item> getItemsByOwner(Person owner);
    List<Item> getItemsByPurchaser(Person purchaser);
}
