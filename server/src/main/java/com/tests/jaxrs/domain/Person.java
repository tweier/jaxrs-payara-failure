package com.tests.jaxrs.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Person {

  private long id;
  private String firstName;
  private String lastName;

  public Person() {
  }
  
  public Person(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public long getId() {
    return id;
  }
  
  public void setId(long id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  
  
}
