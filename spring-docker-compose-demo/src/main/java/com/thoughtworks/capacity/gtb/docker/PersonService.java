package com.thoughtworks.capacity.gtb.docker;

import org.springframework.stereotype.Service;

/**
 * @author itutry
 * @create 2020-05-26_18:28
 */
@Service
public class PersonService {

  private final PersonRepository personRepository;

  public PersonService(PersonRepository personRepository) {
    this.personRepository = personRepository;
  }

  public void createPerson(Person person) {
    personRepository.save(person);
  }

  public Person getPersonById(long id) {
    return personRepository.findById(id);
  }
}
