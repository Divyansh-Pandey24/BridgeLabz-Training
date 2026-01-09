package com.day07.foodloop;
import java.util.List;

public class ComboMeal {

    private List<FoodItem> items;
    private double comboPrice;

    public ComboMeal(List<FoodItem> items, double comboPrice) {
        this.items = items;
        this.comboPrice = comboPrice;
    }

    public double getComboPrice() {
        return comboPrice;
    }

    public List<FoodItem> getItems() {
        return items;
    }
}
