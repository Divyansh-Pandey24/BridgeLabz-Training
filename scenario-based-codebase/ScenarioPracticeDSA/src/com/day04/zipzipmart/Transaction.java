package com.day04.zipzipmart;
class Transaction {
    String date;     // format: YYYY-MM-DD
    double amount;
    String branch;

    Transaction(String date, double amount, String branch) {
        this.date = date;
        this.amount = amount;
        this.branch = branch;
    }

    void display() {
        System.out.println(date + " | " + amount + " | " + branch);
    }
}
