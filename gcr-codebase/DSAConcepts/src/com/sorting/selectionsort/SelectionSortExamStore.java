package com.sorting.selectionsort;

public class SelectionSortExamStore {

	//Method to sort using selection sort

	public void selectionSort(int[] arr) {

		int n = arr.length;

		for (int i = 0; i < n - 1; i++) {

			// Assume current index has the smallest value
			int minIndex = i;

			for (int j = i + 1; j < n; j++) {

				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}

			// Swap only if needed
			if (minIndex != i) {
				int temp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = temp;
			}
		}
	}
}
