package com.day03.smartcheckout;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ProductLog {

    private HashMap<String, List<Double>> product;

    public ProductLog() {
        this.product = new HashMap<>();
    }

    public void addItems(String name, double price, double stock) {
        List<Double> items = new ArrayList<>();
        items.add(price);
        items.add(stock);
        product.put(name, items);
    }

    public void updateStock(String name, int itemsBrought) {
        product.get(name).set(1, product.get(name).get(1) - itemsBrought);
    }

    public HashMap<String, List<Double>> getProducts() {
        return product;
    }

    public void showProducts() {
        System.out.println("\nAVAILABLE PRODUCTS:");
        for (String name : product.keySet()) {
            List<Double> data = product.get(name);
            System.out.println(name + " | Price: " + data.get(0) + " | Stock: " + data.get(1));
        }
    }
}
