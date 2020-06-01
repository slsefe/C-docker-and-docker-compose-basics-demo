package com.thoughtworks.capacity.gtb.docker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author itutry
 * @create 2020-05-26_18:30
 */
@RestController
public class PersonController {

  private final PersonService personService;

  public PersonController(PersonService personService) {
    this.personService = personService;
  }

  @GetMapping("/persons/{id}")
  public Person getPersonById(@PathVariable("id") long id) {
    return personService.getPersonById(id);
  }

  @PostMapping("/persons")
  public void createPerson(@RequestBody Person person) {
    personService.createPerson(person);
  }
}
