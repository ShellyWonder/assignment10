package com.wonderwebdev.assignment10.web;

import com.wonderwebdev.assignment10.dto.*;
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
    public ResponseEntity<WeeklyMealResponse> getWeeklyMeals(
        @RequestParam(name ="targetCalories") String targetCalories, 
        @RequestParam(name ="diet")String diet, 
        @RequestParam(name ="exclude")String exclude) {
        WeeklyMealResponse response = mealPlanService.getWeeklyMeals(targetCalories, diet, exclude);
        return new ResponseEntity<WeeklyMealResponse>(response, HttpStatus.OK);
    }
    @GetMapping("/day")
    public ResponseEntity<DailyMealResponse> getDailyMeals(
        @RequestParam(name ="targetCalories") String targetCalories, 
        @RequestParam(name ="diet")String diet, 
        @RequestParam(name ="exclude")String exclude) {
        DailyMealResponse response = mealPlanService.getDailyMeals(targetCalories, diet, exclude);
        return new ResponseEntity<DailyMealResponse>(response, HttpStatus.OK);
    }
}
