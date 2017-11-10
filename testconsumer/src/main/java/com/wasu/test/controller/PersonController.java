package com.wasu.test.controller;

import com.wasu.test.consumer.PersonConsumer;
import com.wasu.testservice.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    @Autowired
    private PersonConsumer personConsumer;
    @GetMapping("/person/getOnePerson")
    public Person getOnePerson(){
        return personConsumer.getOnePerson();
    }
}
