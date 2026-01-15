package com.day09.payxpress;
public interface IPayable {
    void pay(Bill bill);
    void sendReminder();
}