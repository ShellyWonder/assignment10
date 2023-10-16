package com.wonderwebdev.assignment10.dto;

public class Meal {
    private long id;
    private String title;
    private String imageType;
    private int readyInMinutes;
    private int servings;
    private String sourceUrl;

    public Meal() {

    }


    public Meal(long id, String title, String imageType, int readyInMinutes, int servings, String sourceUrl) {
        this.id = id;
        this.title = title;
        this.imageType = imageType;
        this.readyInMinutes = readyInMinutes;
        this.servings = servings;
        this.sourceUrl = sourceUrl;
    }   
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }



    public String getTitle() {
        return title;
    }



    public void setTitle(String title) {
        this.title = title;
    }



    public String getImageType() {
        return imageType;
    }



    public void setImageType(String imageType) {
        this.imageType = imageType;
    }



    public int getReadyInMinutes() {
        return readyInMinutes;
    }



    public void setReadyInMinutes(int readyInMinutes) {
        this.readyInMinutes = readyInMinutes;
    }



    public int getServings() {
        return servings;
    }



    public void setServings(int servings) {
        this.servings = servings;
    }



    public String getSourceUrl() {
        return sourceUrl;
    }



    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }
    






    
}