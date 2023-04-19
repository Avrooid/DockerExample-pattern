package ru.Burakov.DockerExample.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.Burakov.DockerExample.models.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
