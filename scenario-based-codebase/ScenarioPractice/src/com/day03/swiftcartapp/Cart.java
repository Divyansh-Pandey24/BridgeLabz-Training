package com.day03.swiftcartapp;
import java.util.*;

public class Cart implements ICheckout {

    private List<Product> items = new ArrayList<>();
    private double totalPrice = 0;

    public Cart() {}

    public Cart(List<Product> items) {
        this.items = items;
        calculateTotal();
    }

    public void addProduct(Product p) {
        items.add(p);
        calculateTotal();
    }

    // ONLY Cart can change price (encapsulation)
    private void calculateTotal() {
        totalPrice = 0;
        for (Product p : items) {
            totalPrice += p.getTotalPrice();
        }
    }

    @Override
    public double generateBill() {

        System.out.println("\n--- Bill Details ---");
        for (Product p : items) {
            p.printProduct();
        }

        System.out.println("Subtotal: " + totalPrice);

        return totalPrice;
    }

    // Polymorphism: discount based on product type
    @Override
    public double applyDiscount(double coupon) {

        double discountedTotal = 0;

        for (Product p : items) {
            double productTotal = p.getTotalPrice();
            productTotal = p.applyProductDiscount(productTotal);
            discountedTotal += productTotal;
        }

        // operator: totalPrice - coupon
        discountedTotal = discountedTotal - coupon;

        System.out.println("After discount & coupon: " + discountedTotal);

        return discountedTotal;
    }
}
