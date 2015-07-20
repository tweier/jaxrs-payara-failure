package com.tests.jaxrs.business;

import com.tests.jaxrs.domain.Person;
import javax.ejb.Stateless;

@Stateless
public class DummyPersonServiceBean implements PersonServiceLocal {
  
  @Override
  public Person create(Person person) {
    return person;
  }

  @Override
  public Person read(long id) {
    return new Person("myFirstName", "myLastName");
  }

  @Override
  public Person update(Person person) {
    return person;
  }

  @Override
  public void delete(long id) {
  }

  
}
