package com.dinodelivery.project.controller;

import com.dinodelivery.project.object.Restaurant;
import com.dinodelivery.project.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.LinkedList;
import java.util.List;

@RestController
public class RestaurantController {
    private final RestaurantService restaurantService;

    @Autowired
    public RestaurantController(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }

    @PostMapping("/restaurant")
    public List<Object> getRestaurant(@Valid @RequestBody Integer id) {
        Restaurant res = restaurantService.getRestaurantById(id);
        return getRes(res);
    }

    private List<Object> getRes(Restaurant res) {
        List<Object> toUpload = new LinkedList<>();
        try {
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
            toUpload.add(res.getReviews().toString());
            return toUpload;
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace() + ": getting Restaurant exception!");
        }

        return toUpload;
    }
}
