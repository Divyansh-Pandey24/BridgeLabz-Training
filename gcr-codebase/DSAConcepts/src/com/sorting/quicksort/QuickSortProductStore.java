package com.sorting.quicksort;

public class QuickSortProductStore {

	public void quickSort(double[] arr, int low, int high) {

		if (low < high) {

			// Partition the array
			int pivotIndex = partition(arr, low, high);

			// Recursively sort left side
			quickSort(arr, low, pivotIndex - 1);

			// Recursively sort right side
			quickSort(arr, pivotIndex + 1, high);
		}
	}

	private int partition(double[] arr, int low, int high) {

		// Choosing the last element as pivot
		double pivot = arr[high];

		int i = low - 1; // index of smaller element

		for (int j = low; j < high; j++) {

			// If current element is smaller than pivot
			if (arr[j] < pivot) {
				i++;

				// swap arr[i] & arr[j]
				double temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		// Place pivot in correct position
		double temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;

		return i + 1; // return pivot index
	}
}
