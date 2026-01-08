package com.day06.medistore;
import java.time.LocalDate;
public class Syrup extends Medicine {

    public Syrup(String name, double price, LocalDate expiryDate) {
        super(name, price, expiryDate);
    }

    @Override
    public void checkExpiry() {
        System.out.println("Syrup expiry check (liquid medicine)");
        super.checkExpiry();
    }
}
