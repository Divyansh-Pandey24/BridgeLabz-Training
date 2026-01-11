package com.day01.browserbuddy;
import java.util.*;

public class BrowserBuddy {
    private BrowserTab currentTab;
    private Stack<BrowserTab> closedTabs = new Stack<>();

    public BrowserBuddy() {
        currentTab = new BrowserTab("https://home.com", "Home Tab");
    }

    public static void main(String[] args) {
        BrowserBuddy browser = new BrowserBuddy();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Visit URL");
            System.out.println("2. Back");
            System.out.println("3. Forward");
            System.out.println("4. Close Tab");
            System.out.println("5. Reopen Tab");
            System.out.println("6. Show History");
            System.out.println("7. Exit");
            System.out.print("Choose: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter URL: ");
                String url = sc.nextLine();
                browser.currentTab.visit(url);
            } else if (choice == 2) {
                browser.currentTab.goBack();
            } else if (choice == 3) {
                browser.currentTab.goForward();
            } else if (choice == 4) {
                browser.closedTabs.push(browser.currentTab);
                browser.currentTab = new BrowserTab("https://newtab.com", "New Tab");
                System.out.println("Tab closed. New tab opened.");
            } else if (choice == 5) {
                if (!browser.closedTabs.isEmpty()) {
                    browser.currentTab = browser.closedTabs.pop();
                    System.out.println("Tab reopened.");
                } else {
                    System.out.println("No tab to reopen.");
                }
            } else if (choice == 6) {
                System.out.println("Current URL: " + browser.currentTab.getCurrentUrl());
                browser.currentTab.displayHistory();
            } else if (choice == 7) {
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice.");
            }
            System.out.println();
        }
        sc.close();
    }
}