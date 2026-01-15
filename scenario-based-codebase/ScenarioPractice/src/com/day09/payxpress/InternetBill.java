package com.day09.payxpress;
public class InternetBill extends Bill {

    public InternetBill(double amount, String dueDate) {
        super("Internet", amount, dueDate);
    }

    @Override
    public void sendReminder() {
        if (!isPaid()) {
            System.out.println(" Internet bill unpaid! Service may be suspended after " + getDueDate());
        }
    }
    
    @Override
    public void pay(Bill bill) {
    	System.out.println("The Bill Has been Paid of: "+bill.getAmount());
    	bill.setIsPaid(true);
    }
}