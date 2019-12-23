package com.winters.wishlist.service;

import com.winters.wishlist.model.Item;
import com.winters.wishlist.model.Person;
import com.winters.wishlist.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    private ItemRepository itemRepository;

    @Override
    public Item createItem(Item item) {
        return itemRepository.save(item);
    }

    @Override
    public Optional<Item> getItem(Long id) {
        return itemRepository.findById(id);
    }

    @Override
    public Item editItem(Item item) {
        return itemRepository.save(item);
    }

    @Override
    public void deleteItem(Item item) {
        itemRepository.delete(item);
    }

    @Override
    public void deleteItem(Long id) {
        Optional<Item> item = getItem(id);
        if (item.isPresent()) {
            itemRepository.delete(item.get());
        }
    }

    @Override
    public List<Item> getAllItems(int pageNumber, int pageSize) {
        return itemRepository.findAll(PageRequest.of(pageNumber, pageSize)).getContent();
    }

    @Override
    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

    @Override
    public List<Item> getItemsByOwner(Person owner) {
        return itemRepository.findByOwner(owner, Pageable.unpaged()).toList();
    }

    @Override
    public List<Item> getItemsByPurchaser(Person purchaser) {
        return itemRepository.findByPurchaser(purchaser, Pageable.unpaged()).toList();
    }
}
