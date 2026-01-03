package com.day01.ewalletapplication;

class Wallet implements Transferrable {

    private double balance;   // encapsulated

    public Wallet(double initialAmount) {
        balance = initialAmount;
    }

    // Constructor with referral bonus
    public Wallet(double initialAmount, double referralBonus) {
        balance = initialAmount + referralBonus;
    }

    public double getBalance() {
        return balance;
    }

    protected void credit(double amount) {
        balance += amount;
    }

    protected void debit(double amount) {
        balance -= amount;
    }

    @Override
    public void transferTo(User receiver, double amount) {
        // Base wallet simple transfer
        debit(amount);
        receiver.getWallet().credit(amount);
    }
}
