package com.day01.browserbuddy;
public class BrowserTab {
    private String tabTitle;
    private PageNode current;

    public BrowserTab(String initialUrl, String tabTitle) {
        this.tabTitle = tabTitle;
        current = new PageNode(initialUrl);
    }

    public void visit(String url) {
        PageNode newNode = new PageNode(url);
        newNode.prev = current;
        current.next = newNode;
        current = newNode;
    }

    public void goBack() {
        if (current.prev != null) {
            current = current.prev;
        }
    }

    public void goForward() {
        if (current.next != null) {
            current = current.next;
        }
    }

    public String getCurrentUrl() {
        return current.url;
    }

    public void displayHistory() {
        System.out.println("\nHistory for " + tabTitle + ":");
        PageNode temp = current;
        while (temp.prev != null) {
            temp = temp.prev;
        }
        int i = 1;
        while (temp != null) {
            if (temp == current) {
                System.out.println(i + ". " + temp.url + " <-- current");
            } else {
                System.out.println(i + ". " + temp.url);
            }
            temp = temp.next;
            i++;
        }
        System.out.println();
    }

    public String getTabTitle() {
        return tabTitle;
    }
}