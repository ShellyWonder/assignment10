package com.wonderwebdev.assignment10.services;

import com.wonderwebdev.assignment10.dto.Response;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MealPlanService {
    @Value("${spoonacular.api.key}")
    private String apiKey;

    @Value("${spoonacular.urls.base}")
    private String baseUrl;

    @Value("${spoonacular.urls.mealplan}")
    private String mealPlanUrl;

    public Response getWeeklyMeals(String targetCalories, String diet, String exclude) {
        
        return getMeals(targetCalories, diet, exclude, "weekly");
    }

    public Response getDailyMeals(String targetCalories, String diet, String exclude) {
        return getMeals(targetCalories, diet, exclude, "daily");
    }

    private Response getMeals(String targetCalories, String diet, String exclude, String timeFrame) {
        RestTemplate restTemplate = new RestTemplate();
        String url = baseUrl + mealPlanUrl + "?apiKey=" + apiKey + "&targetCalories=" + targetCalories + "&diet=" + diet
                + "&exclude=" + exclude + "&timeFrame=" + timeFrame;
        Response response = restTemplate.getForObject(url, Response.class);
        response.setTimeFrame(timeFrame); // Set the timeFrame parameter in the response
        return response;
    }
}
