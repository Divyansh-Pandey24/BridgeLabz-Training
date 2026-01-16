package com.day05.robowarehouse;
public class RoboWarehouseApp {

    public static void main(String[] args) {

        PackageItem[] shelf = {
            new PackageItem("PKG1", 40),
            new PackageItem("PKG2", 20),
            new PackageItem("PKG3", 60),
            new PackageItem("PKG4", 30),
            new PackageItem("PKG5", 10)
        };

        System.out.println("Before Sorting");
        for (PackageItem p : shelf) {
            p.display();
        }

        ShelfSorter.insertionSort(shelf);

        System.out.println("\nAfter Sorting by Weight");
        for (PackageItem p : shelf) {
            p.display();
        }
    }
}
