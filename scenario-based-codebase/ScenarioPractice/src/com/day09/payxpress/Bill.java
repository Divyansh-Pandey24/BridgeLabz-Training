package com.day09.payxpress;
abstract public class Bill implements IPayable {

    private String type;
    private double amount;
    private String dueDate;
    private boolean isPaid;   

    
    public Bill(String type, double amount, String dueDate) {
        this.type = type;
        this.amount = amount;
        this.dueDate = dueDate;
        this.isPaid = false;
    }

    // Late fee calculation using operator
    public double calculateLateFee(double penalty) {
        return amount + penalty;
    }

    // Getter methods (no direct setter for isPaid)
    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public String getDueDate() {
        return dueDate;
    }

    public boolean isPaid() {
        return isPaid;
    }
    public void setIsPaid(boolean status) {
        isPaid = status;
    }
}