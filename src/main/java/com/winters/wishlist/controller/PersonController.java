package com.winters.wishlist.controller;

import com.winters.wishlist.model.Person;
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
public class PersonController {
    @Autowired
    private PersonService personService;

    @Autowired
    private ItemService itemService;

    @RequestMapping(value = "/createPerson", method = RequestMethod.GET)
    public String homePage(Model model) {
        model.addAttribute("person", new Person());

        return "createPerson";
    }

    @RequestMapping(value = "/person", method = RequestMethod.POST)
    public String addPersonPage(@ModelAttribute Person person, Model model) {
        personService.createPerson(person);

        return viewPersonPage(model, person.getId());
    }

    @RequestMapping(value = "/person/{id}", method = RequestMethod.GET)
    public String viewPersonPage(Model model, @PathVariable Long id) {
        Optional<Person> person = personService.getPerson(id);
        if (person.isPresent()) {
            model.addAttribute("person", person.get());
            model.addAttribute("items", itemService.getItemsByOwner(person.get()));
        }

        return "viewPerson";
    }
}
