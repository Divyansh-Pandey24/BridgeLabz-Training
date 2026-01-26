package com.day9.ecommerceproductinventory;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Inventory {

    private Map<String, Product> productMap;

    public Inventory() {
        productMap = new HashMap<>();
    }

    public void addProduct(Product product) {
        productMap.put(product.getSku(), product);
    }

    public Product getProductBySku(String sku) {
        return productMap.get(sku);
    }

    public boolean updatePrice(String sku, double newPrice) {
        Product product = productMap.get(sku);
        if (product != null) {
            product.setPrice(newPrice);
            return true;
        }
        return false;
    }

    public void displaySortedProducts() {
        TreeMap<String, Product> sortedMap = new TreeMap<>(productMap);
        for (Product product : sortedMap.values()) {
            System.out.println(product);
        }
    }
}
