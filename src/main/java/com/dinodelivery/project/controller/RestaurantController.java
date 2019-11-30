package com.dinodelivery.project.controller;

import com.dinodelivery.project.object.Restaurant;
import com.dinodelivery.project.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@RestController
public class RestaurantController {
    private final RestaurantService restaurantService;

    @Autowired
    public RestaurantController(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }

    @PostMapping("/restautant")
    public List<Object> getRestaurant(@Valid @RequestBody String name) {
        Restaurant res = restaurantService.getRestaurantByName(name);
        return getRes(res);
    }

    @PostMapping("/restautants")
    public Map<Integer,Object> getRestaurants(@Valid @RequestBody String name) {
        Map restaurants = new HashMap();

        return restaurants;
    }

    private List<Object> getRes(Restaurant res) {
        if (!res.getName().isEmpty()) {
            List<Object> toUpload = new LinkedList<>();
            toUpload.add(res.getId());
            toUpload.add(res.getName());
            toUpload.add(res.getCuisine());
            toUpload.add(res.getCoordinateLat());
            toUpload.add(res.getCoordinateLong());
            toUpload.add(res.getDescription());
            toUpload.add(res.getLink());
            toUpload.add(res.getPhoto());
            toUpload.add(res.getRating());
            toUpload.add(res.getRestaurantPhoneNumber());
            toUpload.add(res.getWorkHours());
            toUpload.add(res.getReviews());//must return array of review
            return toUpload;
        } else {
            throw new NullPointerException("Not found restaurant by name!");
        }
    }
}
