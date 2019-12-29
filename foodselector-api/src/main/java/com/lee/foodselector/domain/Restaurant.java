package com.lee.foodselector.domain;

public class Restaurant {

  private Long id;
  private final String name;
  private final String address;

  public Restaurant(Long id, String name, String address){
    this.id = id;
    this.name = name;
    this.address = address;
  }

  public Object getId() {
    return id;
  }

  public String getName() {
    return  name;
  }

  public Object getAddress() {
    return address;
  }

  public Object getInformation() {
    return name + " in " + address;
  }
}
