package com.day01.ewalletapplication;

class BusinessWallet extends Wallet {

    private double taxRate = 0.02;   // 2% tax

    public BusinessWallet(double amount) {
        super(amount);
    }

    public BusinessWallet(double amount, double bonus) {
        super(amount, bonus);
    }

    @Override
    public void transferTo(User receiver, double amount) {

        double tax = amount * taxRate;

        super.debit(amount + tax);
        receiver.getWallet().credit(amount);
    }
}
