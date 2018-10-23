package com.example.restart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.restart.Entity.Person;
import com.example.restart.Repository.PersonRepository;

@RestController
@RequestMapping(value = "person")
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @PostMapping(path = "addPerson")
    public void addPerson(Person person){
        personRepository.save(person);
    }

    @DeleteMapping(path = "deletePerson")
    public void deletePerson(Long id){
        personRepository.deleteById(id);
    }

    @GetMapping(path = "getPerson")
    public Person getPerson(String name){
        return personRepository.findByName(name);
    }
}
