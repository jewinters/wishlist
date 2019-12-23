package com.winters.wishlist.service;

import com.winters.wishlist.model.Person;
import com.winters.wishlist.repository.PersonRepository;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonRepository personRepository;

    @Override
    public Person createPerson(Person person) {
        return personRepository.save(person);
    }

    @Override
    public Optional<Person> getPerson(Long id) {
        return personRepository.findById(id);
    }

    @Override
    public Person editPerson(Person person) {
        return personRepository.save(person);
    }

    @Override
    public void deletePerson(Person person) {
        personRepository.delete(person);
    }

    @Override
    public void deletePerson(Long id) {
        Optional<Person> person = getPerson(id);
        if (person.isPresent()) {
            personRepository.delete(person.get());
        }
    }

    @Override
    public List<Person> getAllPeople(int pageNumber, int pageSize) {
        return personRepository.findAll(PageRequest.of(pageNumber, pageSize)).getContent();
    }

    @Override
    public List<Person> getAllPeople() {
        return personRepository.findAll();
    }
}
