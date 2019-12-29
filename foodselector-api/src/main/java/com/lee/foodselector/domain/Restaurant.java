package com.lee.foodselector.domain;

public class Restaurant {

  private final String name;
  private final String address;

  public Restaurant(String name, String address){
    this.name = name;
    this.address = address;
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
