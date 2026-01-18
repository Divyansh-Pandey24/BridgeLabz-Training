package com.generics.mealplangenerator;

public class VeganMeal implements MealPlan {

    @Override
    public String getMealType() {
        return "Vegan";
    }

    @Override
    public int getCalories() {
        return 1700;
    }
}
