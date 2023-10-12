package com.wonderwebdev.assignment10.controllers;

import com.wonderwebdev.assignment10.dto.DayResponse;
import com.wonderwebdev.assignment10.dto.WeekResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MealPlanController {

    @GetMapping("/mealplanner/week")
    public ResponseEntity<WeekResponse> getWeekMeals(String numCalories, String diet, String exclusions){
        WeekResponse response = new WeekResponse();
        response.setNumCalories(numCalories);
        response.setDiet(diet);
        response.setExclusions(exclusions);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
    @GetMapping("/mealplanner/day")
    public ResponseEntity<DayResponse> getDayMeals(String numCalories, String diet, String exclusions){
        DayResponse response = new DayResponse();
        response.setNumCalories(numCalories);
        response.setDiet(diet);
        response.setExclusions(exclusions);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
