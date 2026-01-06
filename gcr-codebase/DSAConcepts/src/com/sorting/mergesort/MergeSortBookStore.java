package com.sorting.mergesort;
public class MergeSortBookStore {

    public void mergeSort(double[] arr, int left, int right) {

        if (left < right) {

            // Find the middle index
            int mid = (left + right) / 2;

            // Sort left half
            mergeSort(arr, left, mid);

            // Sort right half
            mergeSort(arr, mid + 1, right);

            // Merge both sorted halves
            merge(arr, left, mid, right);
        }
    }

    private void merge(double[] arr, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Temporary arrays
        double[] leftArr = new double[n1];
        double[] rightArr = new double[n2];

        // Copy data
        for (int i = 0; i < n1; i++)
            leftArr[i] = arr[left + i];

        for (int j = 0; j < n2; j++)
            rightArr[j] = arr[mid + 1 + j];

        int i = 0, j = 0;
        int k = left;

        // Merge back into original array
        while (i < n1 && j < n2) {

            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements if any
        while (i < n1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }
}
