package com.wonderwebdev.assignment10.dto;

public class ReturnSpoonacular {
    private Meal meal;
    private Nutrient nutrient;

    public ReturnSpoonacular() {
 
    }
    public ReturnSpoonacular(Meal meal, Nutrient nutrient) {
        this.meal = meal;
        this.nutrient = nutrient;
    }   
    public Meal getMeal() {
        return meal;
    }
    public void setMeal(Meal meal) {
        this.meal = meal;
    }

    public Nutrient getNutrient() {
        return nutrient;
    }
    public void setNutrient(Nutrient nutrient) {
        this.nutrient = nutrient;
    }
}