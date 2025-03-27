package com.bridgelabz.mealplangenerator;

import java.util.ArrayList;
import java.util.List;

public class MealPlanGenerator {
    public static void main(String[] args) {
        // Creating meal plans
        Meal<VegetarianMeal> vegMeal = new Meal<>(new VegetarianMeal("Grilled Paneer with Salad"));
        Meal<VeganMeal> veganMeal = new Meal<>(new VeganMeal("Tofu Stir-fry"));
        Meal<KetoMeal> ketoMeal = new Meal<>(new KetoMeal("Grilled Chicken with Avocado"));
        Meal<HighProtienMeal> proteinMeal = new Meal<>(new HighProtienMeal("Egg Whites with Oats"));

        // Storing meals in a list
        List<MealPlan> mealPlanList = new ArrayList<>();
        mealPlanList.add(vegMeal.getMealDetails());
        mealPlanList.add(veganMeal.getMealDetails());
        mealPlanList.add(ketoMeal.getMealDetails());
        mealPlanList.add(proteinMeal.getMealDetails());

        // Generate and display meal plan
        MealPlanUtils.generateMealPlan(mealPlanList);
    }
}

/*Generated Personalized Meal Plan:
Vegetarian Meal: Grilled Paneer with Salad
Vegan Meal: Tofu Stir-fry
Keto Meal: Grilled Chicken with Avocado
High Protein Meal: Egg Whites with Oats
 */