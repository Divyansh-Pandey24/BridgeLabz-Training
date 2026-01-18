package com.generics.mealplangenerator;

public class HighProteinMeal implements MealPlan {

    @Override
    public String getMealType() {
        return "High-Protein";
    }

    @Override
    public int getCalories() {
        return 2200;
    }
}
