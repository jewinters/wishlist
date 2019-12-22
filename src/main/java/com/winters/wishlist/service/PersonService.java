package com.winters.wishlist.service;

import com.winters.wishlist.model.Person;
import java.util.List;
import java.util.Optional;

public interface PersonService {
    Person createPerson(Person person);
    Optional<Person> getPerson(Long id);
    Person editPerson(Person person);

    void deletePerson(Person person);
    void deletePerson(Long id);

    List<Person> getAllPersons(int pageNumber, int pageSize);
    List<Person> getAllPersons();
}
