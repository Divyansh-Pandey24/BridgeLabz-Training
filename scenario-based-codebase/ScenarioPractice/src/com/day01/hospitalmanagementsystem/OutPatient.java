package com.day01.hospitalmanagementsystem;

class OutPatient extends Patient {

    // NORMAL outpatient
    public OutPatient(int id, String name, String doctor, String history){
        super(id, name, doctor, history);
    }

    // EMERGENCY outpatient
    public OutPatient(int id, String name, String history){
        super(id, name, history);   // emergency
    }
    
    @Override
    public void displayInfo(){
        System.out.println("In-Patient under: " + doctorAssigned);
    }
}

