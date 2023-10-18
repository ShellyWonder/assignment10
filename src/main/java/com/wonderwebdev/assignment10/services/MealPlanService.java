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

    public WeeklyMealResponse getWeeklyMeals(String targetCalories, String diet, String exclude) {
        return getMeals(targetCalories, diet, exclude, "weekly", WeeklyMealResponse.class);
    }

    public DailyMealResponse getDailyMeals(String targetCalories, String diet, String exclude) {
        return getMeals(targetCalories, diet, exclude, "daily", DailyMealResponse.class);
    }

    private <T> T getMeals(String targetCalories, String diet, String exclude, String timeFrame, Class<T> responseType) {
        RestTemplate restTemplate = new RestTemplate();
        String url = buildApiUrl(targetCalories, diet, exclude, timeFrame);
        
        return restTemplate.getForObject(url, responseType);
    }

    private String buildApiUrl(String targetCalories, String diet, String exclude, String timeFrame) {
        // Construct the URL
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(baseUrl + mealPlanUrl)
                                .queryParam("apiKey", apiKey)
                                .queryParam("targetCalories", targetCalories)
                                .queryParam("diet", diet)
                                .queryParam("exclude", exclude)
                                .queryParam("timeFrame", timeFrame);
     return builder.toUriString();
        
    }
    
}
