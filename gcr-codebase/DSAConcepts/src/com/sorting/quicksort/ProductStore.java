package com.sorting.quicksort;
public class ProductStore {

    private double[] prices;

    public ProductStore(double[] prices) {
        this.prices = prices;
    }

    public double[] getPrices() {
        return prices;
    }

    public void displayPrices() {
        for (double price : prices) {
            System.out.print(price + "  ");
        }
        System.out.println();
    }
}
