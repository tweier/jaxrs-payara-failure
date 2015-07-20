package com.tests.jaxrs.business;

import com.tests.jaxrs.domain.Person;
import javax.ejb.Local;

@Local
public interface PersonServiceLocal {
  
  Person create(Person person);
  
  Person read(long id);
  
  Person update(Person person);
  
  void delete(long id);
  
}

