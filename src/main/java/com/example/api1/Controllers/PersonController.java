package com.example.api1.Controllers;

import com.example.api1.Models.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/person")

public class PersonController {

    //@GetMapping("/a")
    @GetMapping
    public List<Person> get() {

        List<Person> list = new ArrayList<Person>();
        list.add(new Person(28,"Johny Alexis","Aguayo Muñoz"));
        list.add(new Person(28,"Pedro Manuel","Aguayo Muñoz"));

        return list;

    }

}
