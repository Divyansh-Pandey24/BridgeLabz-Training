package com.day04.fittracker;
public abstract class Workout implements ITrackable {

    protected String type;
    protected int duration;         // in minutes
    protected double caloriesBurned;
    private boolean workoutActive;

    public Workout(String type, int duration) {
        this.type = type;
        this.duration = duration;
        this.caloriesBurned = 0;
        this.workoutActive = false;
    }

    public abstract void calculateCalories();

    @Override
    public void startWorkout() {
        workoutActive = true;
    }

    @Override
    public void stopWorkout() {
        workoutActive = false;
    }

    public double getCaloriesBurned() {
        return caloriesBurned;
    }
}
