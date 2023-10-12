package com.wonderwebdev.assignment10.dto;

public class WeekResponse {
    private String numCalories;
    private String diet;
    private String exclusions;

    public WeekResponse() {
    }   
    public WeekResponse(String numCalories, String diet, String exclusions) {
        this.numCalories = numCalories;
        this.diet = diet;
        this.exclusions = exclusions;
    }
    public String getNumCalories() {
        return numCalories;
    }       

    public void setNumCalories(String numCalories) {
        this.numCalories = numCalories;
    }

    public String getDiet() {
        return diet;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }

    public String getExclusions() {
        return exclusions;
    }

    public void setExclusions(String exclusions) {
        this.exclusions = exclusions;
    }   
    
}
