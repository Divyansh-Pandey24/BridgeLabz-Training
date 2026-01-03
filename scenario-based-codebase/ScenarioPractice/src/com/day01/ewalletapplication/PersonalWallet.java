package com.day01.ewalletapplication;

class PersonalWallet extends Wallet {

    private double dailyLimit = 50000;

    public PersonalWallet(double amount) {
        super(amount);
    }

    public PersonalWallet(double amount, double bonus) {
        super(amount, bonus);
    }

    @Override
    public void transferTo(User receiver, double amount) {

        if (amount <= dailyLimit) {
            super.transferTo(receiver, amount);
        }
    }
}
