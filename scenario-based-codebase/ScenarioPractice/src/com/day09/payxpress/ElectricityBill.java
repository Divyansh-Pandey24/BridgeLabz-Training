package com.day09.payxpress;
public class ElectricityBill extends Bill {

    public ElectricityBill(double amount, String dueDate) {
        super("Electricity", amount, dueDate);
    }

    @Override
    public void sendReminder() {
        if (!isPaid()) {
            System.out.println(" Electricity bill pending! Power will be cut after " + getDueDate());
        }
    }
    
    @Override
    public void pay(Bill bill) {
    	System.out.println("The Bill Has been Paid of: "+bill.getAmount());
    	bill.setIsPaid(true);
    }
}
