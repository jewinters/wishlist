package com.winters.wishlist.controller;

import com.winters.wishlist.model.Item;
import com.winters.wishlist.service.ItemService;
import com.winters.wishlist.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Optional;

@Controller
public class ItemController {
    @Autowired
    private ItemService itemService;

    @Autowired
    private PersonService personService;

    @RequestMapping(value = "/createItem", method = RequestMethod.GET)
    public String homePage(Model model) {
        model.addAttribute("item", new Item());
        model.addAttribute("people", personService.getAllPeople());

        return "createItem";
    }

    @RequestMapping(value = "/item", method = RequestMethod.POST)
    public String addItemPage(@ModelAttribute Item item, Model model) {
        itemService.createItem(item);

        return viewItemPage(model, item.getId());
    }

    @RequestMapping(value = "/item/{id}", method = RequestMethod.GET)
    public String viewItemPage(Model model, @PathVariable Long id) {
        Optional<Item> item = itemService.getItem(id);
        if (item.isPresent()) {
            model.addAttribute("item", item.get());
        }

        return "viewItem";
    }
}
