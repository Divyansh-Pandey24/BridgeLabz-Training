package com.day9.medwarehouse;

public class MedWarehouse {

    // Merge Sort
    static Medicine[] mergeSort(Medicine[] arr, int left, int right) {
        if (left == right) {
            return new Medicine[]{ arr[left] };
        }

        int mid = (left + right) / 2;

        Medicine[] leftArr = mergeSort(arr, left, mid);
        Medicine[] rightArr = mergeSort(arr, mid + 1, right);

        return merge(leftArr, rightArr);
    }

    // Merge two sorted arrays
    static Medicine[] merge(Medicine[] a, Medicine[] b) {
        Medicine[] result = new Medicine[a.length + b.length];
        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length) {
            if (a[i].expiryDate <= b[j].expiryDate) {
                result[k++] = a[i++];
            } else {
                result[k++] = b[j++];
            }
        }

        while (i < a.length) result[k++] = a[i++];
        while (j < b.length) result[k++] = b[j++];

        return result;
    }

    // Alert medicines nearing expiry
    static void alertNearExpiry(Medicine[] meds, int thresholdDate) {
        System.out.println("\nMedicines Nearing Expiry:");
        for (Medicine m : meds) {
            if (m.expiryDate <= thresholdDate) {
                m.display();
            }
        }
    }

    public static void main(String[] args) {

        // Sorted list from multiple branches
        Medicine[] medicines = {
            new Medicine("Paracetamol", 20260210),
            new Medicine("Aspirin", 20260315),
            new Medicine("Cough Syrup", 20260125),
            new Medicine("Insulin", 20260201),
            new Medicine("Vitamin C", 20260420)
        };

        System.out.println("Before Sorting:");
        for (Medicine m : medicines) {
            m.display();
        }

        Medicine[] sortedMeds = mergeSort(medicines, 0, medicines.length - 1);

        System.out.println("\nAfter Merge Sort (By Expiry Date):");
        for (Medicine m : sortedMeds) {
            m.display();
        }

        // Alert threshold date (example)
        int thresholdDate = 20260201;
        alertNearExpiry(sortedMeds, thresholdDate);
    }
}