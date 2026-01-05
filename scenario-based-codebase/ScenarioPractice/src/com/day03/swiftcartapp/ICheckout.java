package com.day03.swiftcartapp;
public interface ICheckout {

    double generateBill();
    double applyDiscount(double coupon);
}
