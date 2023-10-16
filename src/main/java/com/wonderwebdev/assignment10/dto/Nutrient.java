package com.wonderwebdev.assignment10.dto;

public class Nutrient {
   private Double Calories;
    private Double Fat;
    private Double Protein;
    private Double Carbohydrates;

    public Nutrient() {
 
    }
    public Nutrient(Double Calories, Double Fat, Double Protein, Double Carbohydrates) {
        this.Calories = Calories;
        this.Fat = Fat;
        this.Protein = Protein;
        this.Carbohydrates = Carbohydrates;
    }

        public Double getCalories() {
        return Calories;
    }
    public void setCalories(Double Calories) {
        this.Calories = Calories;
    }

    public Double getFat() {
        return Fat;
    }
    public void setFat(Double Fat) {
        this.Fat = Fat;
    }

    public Double getProtein() {
        return Protein;
    }
    public void setProtein(Double Protein) {
        this.Protein = Protein;
    }

    public Double getCarbohydrates() {
        return Carbohydrates;
    }
    public void setCarbohydrates(Double Carbohydrates) {
        this.Carbohydrates = Carbohydrates;
    }
    
    
}
