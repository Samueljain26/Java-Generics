package com.bridgelabz.mealplangenerator;

public class VegetarianMeal implements MealPlan {
    private String mainDish;

    public VegetarianMeal(String mainDish) {
        this.mainDish = mainDish;
    }

    @Override
    public void displayMeal() {
        System.out.println("Vegetarian Meal: " + mainDish);
    }
}

