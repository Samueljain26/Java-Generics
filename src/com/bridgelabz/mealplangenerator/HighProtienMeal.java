package com.bridgelabz.mealplangenerator;

public class HighProtienMeal implements MealPlan {
    private String mainDish;

    public HighProtienMeal(String mainDish) {
        this.mainDish = mainDish;
    }

    @Override
    public void displayMeal() {
        System.out.println("High Protein Meal: " + mainDish);
    }
}
