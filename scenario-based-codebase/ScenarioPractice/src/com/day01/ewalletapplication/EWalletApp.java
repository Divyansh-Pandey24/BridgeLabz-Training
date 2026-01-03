package com.day01.ewalletapplication;

public class EWalletApp {

    public static void main(String[] args) {

        User u1 = new User("Rohan",
                new PersonalWallet(1000, 100));   // with referral bonus

        User u2 = new User("Meera",
                new BusinessWallet(5000));

        u1.getWallet().transferTo(u2, 500);

        System.out.println("Rohan Balance: " + u1.getWallet().getBalance());
        System.out.println("Meera Balance: " + u2.getWallet().getBalance());
    }
}
