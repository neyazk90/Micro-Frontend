package com.cws.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
  private String name;
  private final Address address;

  @Autowired
  public Person(Address address) {
    this.address = address;
    this.name = "Sandip";
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  @Override
  public String toString() {
    return "Person{" +
            "name='" + name + '\'' +
            ", address=" + address.getCity() +
            '}';
  }
}
