package com.day01.hospitalmanagementsystem;

class InPatient extends Patient {

    private int numberOfDays;

    // NORMAL admission
    public InPatient(int id, String name, String doctor, int days, String history){
        super(id, name, doctor, history);
        this.numberOfDays = days;
    }

    // EMERGENCY admission
    public InPatient(int id, String name, int days, String history){
        super(id, name, history);   // calls emergency constructor
        this.numberOfDays = days;
    }
    
    @Override
    public void displayInfo(){
        System.out.println("In-Patient under: " + doctorAssigned);
    }
}

