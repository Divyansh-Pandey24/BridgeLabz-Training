package com.sorting.mergesort;
public class BookStore {

    private double[] prices;

    public BookStore(double[] prices) {
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
