package com.bridgelabz.mealplangenerator;

public class KetoMeal implements MealPlan {
    private String mainDish;

    public KetoMeal(String mainDish) {
        this.mainDish = mainDish;
    }

    @Override
    public void displayMeal() {
        System.out.println("Keto Meal: " + mainDish);
    }
}

