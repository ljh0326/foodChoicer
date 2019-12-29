package com.lee.foodselector.domain;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class RestaurantTests {

  @Test
  public void creation(){
    Restaurant restaurant = new Restaurant("Bob zip", "Seoul");
    assertThat(restaurant.getName(), is("Bob zip"));
    assertThat(restaurant.getAddress(), is("Seoul"));
  }

  @Test
  public void information(){
    Restaurant restaurant = new Restaurant("Bob zip", "Seoul");
    assertThat(restaurant.getInformation(), is("Bob zip in Seoul"));
  }

}
