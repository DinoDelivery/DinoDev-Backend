package com.dinodelivery.project.object;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "restaurant")
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "rating")
    private int rating;

    @Column(name = "link")
    private String link;

    @Column(name = "reviews")
    @ElementCollection(targetClass=String.class)
    private List<String> reviews;

    @Column(name = "description")
    private String description;

    @Column(name = "photo")
    private String photo;

    @Column(name = "long")
    private double coordinateLong;

    @Column(name = "lat")
    private double coordinateLat;

    @Column(name = "id_dish")
    private String cuisine;

    @Column(name = "workhours")
    private String workHours;

    @Column(name = "restaurant_phone_number")
    private String restaurantPhoneNumber;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCuisine() {
        return cuisine;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    public double getCoordinateLat() {
        return coordinateLat;
    }

    public void setCoordinateLat(double coordinateLat) {
        this.coordinateLat = coordinateLat;
    }

    public double getCoordinateLong() {
        return coordinateLong;
    }

    public void setCoordinateLong(double coordinateLong) {
        this.coordinateLong = coordinateLong;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getReviews() {
        return reviews;
    }

    public void setReviews(List<String> reviews) {
        this.reviews = reviews;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWorkHours() {
        return workHours;
    }

    public void setWorkHours(String workHours) {
        this.workHours = workHours;
    }

    public String getRestaurantPhoneNumber() {
        return restaurantPhoneNumber;
    }

    public void setRestaurantPhoneNumber(String restaurantPhoneNumber) {
        this.restaurantPhoneNumber = restaurantPhoneNumber;
    }
}
