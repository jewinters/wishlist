package com.winters.wishlist.controller;

import com.winters.wishlist.model.Person;
import com.winters.wishlist.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PersonController {
    @Autowired
    private PersonService personService;

    @RequestMapping(value = "/createPerson", method = RequestMethod.GET)
    public String homePage(Model model) {
        model.addAttribute("person", new Person());

        return "createPerson";
    }

    @RequestMapping(value = "/person", method = RequestMethod.POST)
    public String addPersonPage(@ModelAttribute Person person, Model model) {
        personService.createPerson(person);

        return viewPeoplePage(model);
    }

    @RequestMapping(value = "/person", method = RequestMethod.GET)
    public String viewPeoplePage(Model model) {
        model.addAttribute("persons", personService.getAllPersons());
        return "viewPeople";
    }
}
