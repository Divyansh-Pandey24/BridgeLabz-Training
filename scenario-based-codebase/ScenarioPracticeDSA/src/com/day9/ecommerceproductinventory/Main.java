package com.day9.ecommerceproductinventory;
public class Main {
    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        inventory.addProduct(new Product("SKU102", "Laptop", 75000));
        inventory.addProduct(new Product("SKU101", "Mouse", 1200));
        inventory.addProduct(new Product("SKU103", "Keyboard", 2500));

        System.out.println(inventory.getProductBySku("SKU101"));

        inventory.updatePrice("SKU102", 72000);

        inventory.displaySortedProducts();
    }
}
