package com.sorting.quicksort;

public class QuickSortMain {

	public static void main(String[] args) {

		double[] productPrices = { 999.0, 150.5, 499.0, 89.9, 699.0 };

		ProductStore store = new ProductStore(productPrices);

		System.out.println("Before Sorting:");
		store.displayPrices();

		QuickSortProductStore sorter = new QuickSortProductStore();
		sorter.quickSort(store.getPrices(), 0, productPrices.length - 1);

		System.out.println("After Sorting:");
		store.displayPrices();
	}
}
