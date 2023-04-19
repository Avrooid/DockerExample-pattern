package ru.Burakov.DockerExample.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.Burakov.DockerExample.models.Person;
import ru.Burakov.DockerExample.services.PersonService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PersonController {
    private final PersonService personService;

    @GetMapping("/persons")
    public List<Person> getPersons() {
        return personService.getPersons();
    }

    @GetMapping("/persons/{id}")
    public Person getPersonById(@PathVariable Long id) {
        return personService.getPersonById(id);
    }

    @PostMapping("/persons/add")
    public Person addPerson(@RequestBody Person person) {
        return personService.addPerson(person);
    }

    @PostMapping("/persons/delete/{id}")
    public void deletePersonById(@PathVariable Long id) {
        personService.deletePersonById(id);
    }
}
