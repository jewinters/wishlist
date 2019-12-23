package com.winters.wishlist.controller;

import com.winters.wishlist.model.Person;
import com.winters.wishlist.service.PersonService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;

import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import org.springframework.web.context.WebApplicationContext;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

//TODO: Figure out what Spring magic I'm missing.
// Failing to find the PersonService bean during test runs.
//@ExtendWith(SpringExtension.class)
//@WebAppConfiguration
//@ContextConfiguration(classes = PersonController.class)
class PeopleControllerTest {
//    @Autowired
//    private WebApplicationContext webApplicationContext;
//
//    private MockMvc mockMvc;
//
//    @Mock
//    PersonService personService;
//
//    @InjectMocks
//    PersonController personController;
//
//    @BeforeEach
//    public void setup() {
//        MockitoAnnotations.initMocks(this);
//
//        this.mockMvc = MockMvcBuilders
//                .webAppContextSetup(this.webApplicationContext)
//                .build();
//    }
//
//    @Test
//    void itRespondsToGetAtRoot() throws Exception {
//        List<Person> list = new ArrayList<Person>();
//        Person personOne = new Person();
//        personOne.setName("Jeremy");
//
//        when(personService.getAllPersons()).thenReturn(list);
//
//        this.mockMvc.perform(get("/person"))
//                .andExpect(status().isOk())
//                .andExpect(view().name("viewPeople"));
//    }
}