package com.axsosacademy.mvc.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

import java.util.Date;

@Entity
@Table(name = "burgers")
public class Burger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 3, max = 100)
    private String burgerName;

    @NotNull
    @Size(min = 3, max = 100)
    private String restaurantName;

    @NotNull
    @Min(1)
    @Max(5)
    private Double rating;

    @NotNull
    @Size(max = 500) // Assuming a maximum length for the description
    private String description; // New field for description

    @Column(updatable = false)
    private Date createdAt;

    private Date updatedAt;

    public Burger() {}

    public Burger(String burgerName, String restaurantName, Double rating, String description) {
        this.burgerName = burgerName;
        this.restaurantName = restaurantName;
        this.rating = rating;
        this.description = description; 
    }


    public Long getId() {
        return id;
    }

    public String getBurgerName() {
        return burgerName;
    }

    public void setBurgerName(String burgerName) {
        this.burgerName = burgerName;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description; 
    }

    public void setDescription(String description) {
        this.description = description; 
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    @PrePersist
    protected void onCreate() {
        this.createdAt = new Date();
    }

    @PreUpdate
    protected void onUpdate() {
        this.updatedAt = new Date();
    }
}