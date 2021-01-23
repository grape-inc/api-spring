package com.grapeinc.api.services;

import com.grapeinc.api.dao.PersonDao;
import com.grapeinc.api.models.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    private final PersonDao personDAO;

    @Autowired
    public PersonService(@Qualifier("person") PersonDao personDAO) {
        this.personDAO = personDAO;
    }

    public int addPerson(Person person) {
        return personDAO.insertPerson(person);
    }

    public List<Person> getAllPersons() {
        return personDAO.selectAllPerson();
    }

}
