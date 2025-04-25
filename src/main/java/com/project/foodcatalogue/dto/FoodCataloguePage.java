package com.project.foodcatalogue.dto;

import com.project.foodcatalogue.entity.FoodItem;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

public class FoodCataloguePage {
    private List<FoodItem> foodItemsList;
    private Restaurant restaurant;

    public FoodCataloguePage(List<FoodItem> foodItemsList, Restaurant restaurant) {
        this.foodItemsList = foodItemsList;
        this.restaurant = restaurant;
    }

    public FoodCataloguePage() {
    }

    public List<FoodItem> getFoodItemsList() {
        return foodItemsList;
    }

    public void setFoodItemsList(List<FoodItem> foodItemsList) {
        this.foodItemsList = foodItemsList;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }
}
