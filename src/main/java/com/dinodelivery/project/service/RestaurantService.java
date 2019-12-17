package com.dinodelivery.project.service;

import com.dinodelivery.project.object.Restaurant;
import com.dinodelivery.project.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RestaurantService {
    private final RestaurantRepository restaurantRepository;

    @Autowired
    public RestaurantService(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }

    public Restaurant getRestaurantById(Integer id) {
        return restaurantRepository.getRestaurantById(id);
    }
}
