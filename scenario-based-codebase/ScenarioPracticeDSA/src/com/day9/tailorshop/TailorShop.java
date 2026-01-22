package com.day9.tailorshop;

public class TailorShop {
	public static Tailor[] insertionSort(Tailor[] t) {
		
		int n =t.length;
		for(int i=0; i<n ; i++) {
			Tailor key = t[i];
			int j = i-1;
			while(j>=0 && t[j].deadlineDate > key.deadlineDate) {
				t[j+1] = t[j];
				j--;
			}
			t[j+1] = key;
		}
		return t;
	}
	public static void main(String[] args) {
		Tailor[] tailor = {
				new Tailor("Pant Shirt", 25),
				new Tailor("Kurta", 20),
				new Tailor("Rajasthani Coat", 7),
				new Tailor("Boxers", 15)
		};
		Tailor[] result = insertionSort(tailor);
		System.out.println("===========================================");
		System.out.println("          Tailor Shop Deadline             ");
		System.out.println("===========================================\n");
		System.out.printf("%-20s %-10s", "  Cloth Name", "DeadLine");
		System.out.println("\n-------------------------------------------");
		for(Tailor a : result) {
			System.out.printf("%-20s %-10d%n", a.clothName, a.deadlineDate);
		}
		System.out.println("===========================================");
		System.out.println("               Thanks You                    ");
		System.out.println("===========================================");
	}

}