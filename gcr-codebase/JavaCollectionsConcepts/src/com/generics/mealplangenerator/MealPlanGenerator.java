package com.generics.mealplangenerator;

public class MealPlanGenerator {

    public static <T extends MealPlan> Meal<T> generateMealPlan(
            String userName, T mealPlan) {

        // Validation logic
        if (mealPlan.getCalories() <= 0) {
            throw new IllegalArgumentException("Invalid calorie count");
        }

        return new Meal<>(userName, mealPlan);
    }
}
