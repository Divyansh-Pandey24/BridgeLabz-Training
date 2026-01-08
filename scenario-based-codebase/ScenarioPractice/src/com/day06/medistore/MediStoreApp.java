package com.day06.medistore;
import java.time.LocalDate;

public class MediStoreApp {

    public static void main(String[] args) {

        Medicine m1 = new Tablet(
                "Paracetamol", 20,
                LocalDate.of(2026, 5, 10)
        );

        Medicine m2 = new Syrup(
                "Cough Syrup", 120,
                LocalDate.of(2024, 12, 1)
        );

        m1.sell(3);
        m1.checkExpiry();

        System.out.println();

        m2.sell(2);
        m2.checkExpiry();
    }
}
