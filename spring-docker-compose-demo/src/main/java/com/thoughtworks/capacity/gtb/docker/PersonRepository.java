package com.thoughtworks.capacity.gtb.docker;

import org.springframework.data.repository.CrudRepository;

/**
 * @author itutry
 * @create 2020-05-26_18:27
 */
public interface PersonRepository extends CrudRepository<Person, Long> {

  Person findById(long id);
}
