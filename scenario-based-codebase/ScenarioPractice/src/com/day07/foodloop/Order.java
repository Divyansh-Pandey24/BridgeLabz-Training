package com.day07.foodloop;
import java.util.ArrayList;
import java.util.List;

public class Order implements IOrderable {

    private List<FoodItem> items = new ArrayList<>();
    private List<ComboMeal> combos = new ArrayList<>();
    private double total = 0;
    private String status = "Created";

    public void addItem(FoodItem item) {
        if (item.reduceStock(1)) {
            items.add(item);
            total += item.getPrice();
        }
    }

    public void addCombo(ComboMeal combo) {
        combos.add(combo);
        total += combo.getComboPrice();
    }

    private double applyDiscount() {
        if (total > 1000) {
            return total * 0.15;
        } else if (total > 500) {
            return total * 0.10;
        } else {
            return 0;
        }
    }

    public double getFinalAmount() {
        return total - applyDiscount();
    }

    public void placeOrder() {
        status = "Placed";
    }

    public void cancelOrder() {
        status = "Cancelled";
    }

    public String getStatus() {
        return status;
    }
}
