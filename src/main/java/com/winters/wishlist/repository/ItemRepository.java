package com.winters.wishlist.repository;

import com.winters.wishlist.model.Item;
import com.winters.wishlist.model.Person;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
    Page<Item> findByOwner(Person owner, Pageable pageable);
    Page<Item> findByPurchaser(Person purchaser, Pageable pageable);
}
