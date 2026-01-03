package com.day01.hospitalmanagementsystem;

class Bill implements Payable {

    private double baseAmount;
    private boolean insuranceCovered;

    public Bill(double baseAmount, boolean insuranceCovered){
        this.baseAmount = baseAmount;
        this.insuranceCovered = insuranceCovered;
    }

    @Override
    public double calculatePayment(){

        double tax = baseAmount * 0.18;          // 18% tax
        double discount = insuranceCovered ? baseAmount * 0.30 : 0;

        return baseAmount + tax - discount;
    }
}

