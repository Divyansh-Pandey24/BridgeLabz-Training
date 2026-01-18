package com.generics.smartwarehousemanagementsystem;

public class SmartWarehouseSystem {

    public static void main(String[] args) {

        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop", 65000));
        electronicsStorage.addItem(new Electronics("Mobile", 30000));

        Storage<Groceries> groceriesStorage = new Storage<>();
        groceriesStorage.addItem(new Groceries("Rice", 1200));
        groceriesStorage.addItem(new Groceries("Milk", 50));

        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Table", 5000));
        furnitureStorage.addItem(new Furniture("Chair", 1500));

        System.out.println("---- Electronics ----");
        WarehouseUtil.displayItems(electronicsStorage.getItems());

        System.out.println("\n---- Groceries ----");
        WarehouseUtil.displayItems(groceriesStorage.getItems());

        System.out.println("\n---- Furniture ----");
        WarehouseUtil.displayItems(furnitureStorage.getItems());
    }
}
