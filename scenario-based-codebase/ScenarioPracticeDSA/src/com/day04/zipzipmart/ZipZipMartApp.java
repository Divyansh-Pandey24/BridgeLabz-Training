package com.day04.zipzipmart;
public class ZipZipMartApp {

    public static void main(String[] args) {

        Transaction[] sales = {
            new Transaction("2026-01-15", 1500, "Delhi"),
            new Transaction("2026-01-14", 900, "Mumbai"),
            new Transaction("2026-01-15", 1200, "Chennai"),
            new Transaction("2026-01-13", 3000, "Kolkata"),
            new Transaction("2026-01-14", 500, "Pune")
        };

        System.out.println("Before Sorting:");
        ZipZipSorter.display(sales);

        ZipZipSorter.mergeSort(sales, 0, sales.length - 1);

        System.out.println("\nAfter Sorting (Date - Amount):");
        ZipZipSorter.display(sales);
    }
}
