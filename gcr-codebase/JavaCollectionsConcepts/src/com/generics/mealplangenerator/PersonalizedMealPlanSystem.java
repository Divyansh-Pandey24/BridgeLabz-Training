package com.generics.mealplangenerator;

public class PersonalizedMealPlanSystem {

    public static void main(String[] args) {

        Meal<VegetarianMeal> vegMeal =
                MealPlanGenerator.generateMealPlan(
                        "Rajesh", new VegetarianMeal());

        Meal<VeganMeal> veganMeal =
                MealPlanGenerator.generateMealPlan(
                        "Aman", new VeganMeal());

        Meal<KetoMeal> ketoMeal =
                MealPlanGenerator.generateMealPlan(
                        "Neha", new KetoMeal());

        Meal<HighProteinMeal> proteinMeal =
                MealPlanGenerator.generateMealPlan(
                        "Kunal", new HighProteinMeal());

        System.out.println("---- Personalized Meal Plans ----");
        System.out.println(vegMeal);
        System.out.println(veganMeal);
        System.out.println(ketoMeal);
        System.out.println(proteinMeal);
    }
}
