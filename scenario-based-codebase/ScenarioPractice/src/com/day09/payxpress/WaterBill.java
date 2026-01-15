package com.day09.payxpress;

public class WaterBill extends Bill {

    public WaterBill(double amount, String dueDate) {
        super("Water", amount, dueDate);
    }

    @Override
    public void sendReminder() {
        if (!isPaid()) {
            System.out.println(" Water bill pending! Pay before " + getDueDate());
        }
    }
    
    @Override
    public void pay(Bill bill) {
    	System.out.println("The Bill Has been Paid of: "+bill.getAmount());
    	bill.setIsPaid(true);
    }
}
