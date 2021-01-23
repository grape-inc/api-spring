package com.grapeinc.api.dao;

import com.grapeinc.api.models.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository("person")
public class PersonDataService implements PersonDao{
    private  static  List<Person> DB = new ArrayList<>();

    @Override
    public int insertPerson(UUID id, Person person) {
        DB.add(new Person(id, person.getName()));
        return 1;
    }

    @Override
    public List<Person> selectAllPerson() {
        return DB;
    }
}
