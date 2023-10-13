package com.wonderwebdev.assignment10.controllers;

import com.wonderwebdev.assignment10.dto.Response;
import com.wonderwebdev.assignment10.services.MealPlanService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MealPlanController {

    @Autowired
    private MealPlanService mealPlanService;

    @GetMapping("/mealplanner/week")
    public ResponseEntity<Response> getWeeklyMeals(String targetCalories, String diet, String exclude) {
        Response response = mealPlanService.getWeeklyMeals(targetCalories, diet, exclude);
        return new ResponseEntity<Response>(response, HttpStatus.OK);
    }
    @GetMapping("/mealplanner/day")
    public ResponseEntity<Response> getDailyMeals(String targetCalories, String diet, String exclude) {
        Response response = mealPlanService.getDailyMeals(targetCalories, diet, exclude);
        return new ResponseEntity<Response>(response, HttpStatus.OK);
    }
}
