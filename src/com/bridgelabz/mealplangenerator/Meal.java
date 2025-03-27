package com.bridgelabz.mealplangenerator;

import java.util.List;

public class Meal<T extends MealPlan> {
    private T mealDetails;

    public Meal(T mealDetails) {
        this.mealDetails = mealDetails;
    }

    public T getMealDetails() {
        return mealDetails;
    }

    public void display() {
        mealDetails.displayMeal();
    }
};

class MealPlanUtils {
    public static <T extends MealPlan> void generateMealPlan(List<T> meals) {
        System.out.println("Generated Personalized Meal Plan:");
        for (T meal : meals) {
            meal.displayMeal();
        }
    }
}


