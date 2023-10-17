package com.wonderwebdev.assignment10.services;

import com.wonderwebdev.assignment10.dto.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class MealPlanService {
    @Value("${spoonacular.api.key}")
    private String apiKey;

    @Value("${spoonacular.urls.base}")
    private String baseUrl;

    @Value("${spoonacular.urls.mealplan}")
    private String mealPlanUrl;

    public ReturnSpoonacular getWeeklyMeals(String targetCalories, String diet, String exclude) {
        return getMeals(targetCalories, diet, exclude, "weekly");
    }

    public ReturnSpoonacular getDailyMeals(String targetCalories, String diet, String exclude) {
        return getMeals(targetCalories, diet, exclude, "daily");
    }

    private ReturnSpoonacular getMeals(String targetCalories, String diet, String exclude, String timeFrame) {
        RestTemplate restTemplate = new RestTemplate();
        
        // Construct the URL
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(baseUrl + mealPlanUrl)
                                    .queryParam("apiKey", apiKey)
                                    .queryParam("targetCalories", targetCalories)
                                    .queryParam("diet", diet)
                                    .queryParam("exclude", exclude)
                                    .queryParam("timeFrame", timeFrame);

        String url = builder.toUriString();
        System.out.println("API Request URL: " +url);
        
        ReturnSpoonacular response = restTemplate.getForObject(url, ReturnSpoonacular.class);
        return response;
    }
}
