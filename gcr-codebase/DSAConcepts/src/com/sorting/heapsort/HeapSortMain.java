package com.sorting.heapsort;

public class HeapSortMain {

	public static void main(String[] args) {

		double[] expectedSalaries = { 45000, 70000, 32000, 90000, 55000 };

		JobApplicants applicants = new JobApplicants(expectedSalaries);

		System.out.println("Before Sorting:");
		applicants.displaySalaries();

		HeapSortJobApplicants sorter = new HeapSortJobApplicants();
		sorter.heapSort(applicants.getSalaries());

		System.out.println("After Sorting:");
		applicants.displaySalaries();
	}
}
