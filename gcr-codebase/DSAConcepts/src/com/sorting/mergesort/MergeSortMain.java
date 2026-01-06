package com.sorting.mergesort;
public class MergeSortMain {

    public static void main(String[] args) {

        double[] bookPrices = {499.0, 199.5, 999.0, 150.0, 349.9};

        BookStore store = new BookStore(bookPrices);

        System.out.println("Before Sorting:");
        store.displayPrices();

        MergeSortBookStore sorter = new MergeSortBookStore();
        sorter.mergeSort(store.getPrices(), 0, bookPrices.length - 1);

        System.out.println("After Sorting:");
        store.displayPrices();
    }
}
