package com.wonderwebdev.assignment10.dto;

public class RequestOptions {
    private String targetCalories;
    private String diet;
    private String exclude;
    private String timeFrame;

    public RequestOptions() {
 
    }

    public RequestOptions(String targetCalories, String diet, String exclude, String timeFrame) {
        this.targetCalories = targetCalories;
        this.diet = diet;
        this.exclude = exclude;
        this.timeFrame = timeFrame;
    }

    public String gettargetCalories() {
        return targetCalories;
    }

    public void settargetCalories(String targetCalories) {
        this.targetCalories = targetCalories;
    }

    public String getDiet() {
        return diet;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }


    public String getExclude() {
        return exclude;
    }


    public void setExclude(String exclude) {
        this.exclude = exclude;
    }

    public String getTimeFrame() {
        return timeFrame;
    }



    public void setTimeFrame(String timeFrame) {
        this.timeFrame = timeFrame;
    }



    











}
