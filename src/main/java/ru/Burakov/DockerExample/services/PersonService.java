package ru.Burakov.DockerExample.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.Burakov.DockerExample.models.Person;
import ru.Burakov.DockerExample.repositories.PersonRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonService {
    private final PersonRepository personRepository;

    public List<Person> getPersons() {
        return personRepository.findAll();
    }

    public Person getPersonById(Long id) {
        return personRepository.getReferenceById(id);
    }

    public Person addPerson(Person person) {
        return personRepository.save(person);
    }

    public void deletePersonById(Long id) {
        personRepository.deleteById(id);
    }
}
