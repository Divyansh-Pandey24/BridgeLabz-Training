package com.day05.robowarehouse;
class ShelfSorter {

    public static void insertionSort(PackageItem[] shelf) {

        for (int i = 1; i < shelf.length; i++) {
            PackageItem key = shelf[i];
            int j = i - 1;

            while (j >= 0 && shelf[j].weight > key.weight) {
                shelf[j + 1] = shelf[j];
                j--;
            }

            shelf[j + 1] = key;
        }
    }
}
