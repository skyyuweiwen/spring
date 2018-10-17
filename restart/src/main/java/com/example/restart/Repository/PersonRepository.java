package com.example.restart.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.restart.Entity.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
    Person findByName(String name);
}
