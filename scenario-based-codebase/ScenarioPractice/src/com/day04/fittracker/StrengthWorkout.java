package com.day04.fittracker;
public class StrengthWorkout extends Workout {

    public StrengthWorkout(int duration) {
        super("Strength", duration);
    }

    @Override
    public void calculateCalories() {
        caloriesBurned = duration * 6.0;   // Different formula
    }
}
