package com.lee.foodselector.interfaces;

import com.lee.foodselector.domain.Restaurant;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestaurantController {

  @GetMapping("/restaurants")
  public List<Restaurant> list(){
    List<Restaurant> restaurants = new ArrayList<>();
    Restaurant restaurant = new Restaurant(1004L, "Bob zip", "Seoul");
    restaurants.add(restaurant);
    return restaurants;
  }
}
