package com.winters.wishlist.controller;

import com.winters.wishlist.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PeopleController {
    @Autowired
    private PersonService personService;

    @RequestMapping(value = "/people", method = RequestMethod.GET)
    public String viewPeoplePage(Model model) {
        model.addAttribute("people", personService.getAllPeople());
        return "viewPeople";
    }
}
