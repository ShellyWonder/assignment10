package com.wonderwebdev.assignment10.controllers;

import com.wonderwebdev.assignment10.dto.ReturnSpoonacular;
import com.wonderwebdev.assignment10.services.MealPlanService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MealPlanController {

    @Autowired
    private MealPlanService mealPlanService;

    @GetMapping("/week")
    public ResponseEntity<ReturnSpoonacular> getWeeklyMeals(
        @RequestParam(name ="targetCalories") String targetCalories, 
        @RequestParam(name ="diet")String diet, 
        @RequestParam(name ="exclude")String exclude) {
        ReturnSpoonacular response = mealPlanService.getWeeklyMeals(targetCalories, diet, exclude);
        return new ResponseEntity<ReturnSpoonacular>(response, HttpStatus.OK);
    }
    @GetMapping("/day")
    public ResponseEntity<ReturnSpoonacular> getDailyMeals(
        @RequestParam(name ="targetCalories") String targetCalories, 
        @RequestParam(name ="diet")String diet, 
        @RequestParam(name ="exclude")String exclude) {
        ReturnSpoonacular response = mealPlanService.getDailyMeals(targetCalories, diet, exclude);
        return new ResponseEntity<ReturnSpoonacular>(response, HttpStatus.OK);
    }
}
