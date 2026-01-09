package com.day07.artify;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArtifyApp {

	public static void main(String[] args) {

		System.out.println("=============================");
		System.out.println("   Welcome to Artify    ");
		System.out.println("=============================");
		// Taking user data
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the user name: ");
		String name = sc.nextLine();
		System.out.println("Enter the wallet amount");
		double amount = sc.nextDouble();
		User u1 = new User(name, amount);

		while (true) {

			System.out.println("=======Available Digital Arts=========\n");
			List<Artwork> list = new ArrayList<>();
			list.add(new DigitalArt("Madhubani", "akshat", 1000, "Personal"));
			list.add(new PrintArt("heroshimi", "vaidik", 2000, "Commercial"));
			list.add(new DigitalArt("dhwani", "puri", 5000, "Royalty"));
			list.add(new PrintArt("bani", "ashish", 30000, "Exclusive"));

			// Displaying types of arts to users
			for (Artwork art : list) {
				System.out.println("Title: " + art.title + " | Author Name: " + art.artist + " | Price: "
						+ art.getPrice() + " | License Type: " + art.getLicenseType());

			}
			// User selects the art
			System.out.println("Select the art 1 to 4");
			System.out.print("Enter the option");

			int type = sc.nextInt();
			if (type == -1) {
				break;
			}
			if (type == 1) {
				Artwork obj = list.get(type - 1);
				boolean check = obj.purchase(u1);
				if (check) {
					System.out.println("Enter the terms");
					int terms = sc.nextInt();
					obj.license(terms, u1);
				} else {
					continue;
				}

			} else if (type == 2) {
				Artwork obj = list.get(type - 1);
				boolean check = obj.purchase(u1);
				if (check) {
					System.out.println("Enter the terms");
					int terms = sc.nextInt();
					obj.license(terms, u1);
				} else {
					continue;
				}
			} else if (type == 3) {
				Artwork obj = list.get(type - 1);
				boolean check = obj.purchase(u1);
				if (check) {
					System.out.println("Enter the terms");
					int terms = sc.nextInt();
					obj.license(terms, u1);
				} else {
					continue;
				}
			} else if (type == 4) {
				Artwork obj = list.get(type - 1);
				boolean check = obj.purchase(u1);
				if (check) {
					System.out.println("Enter the terms");
					int terms = sc.nextInt();
					obj.license(terms, u1);
				} else {
					continue;
				}
			} else {
				System.out.println("Not Available");
			}
		}
		System.out.println("Thank you for visiting");
	}
}
