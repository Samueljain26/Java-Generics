package com.bridgelabz.mealplangenerator;

public class VeganMeal implements MealPlan {
    private String mainDish;

    public VeganMeal(String mainDish) {
        this.mainDish = mainDish;
    }

    @Override
    public void displayMeal() {
        System.out.println("Vegan Meal: " + mainDish);
    }
}
