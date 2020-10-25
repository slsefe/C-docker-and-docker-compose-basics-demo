package com.thoughtworks.capacity.gtb.docker;

import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long> {

  Person findById(long id);
}
