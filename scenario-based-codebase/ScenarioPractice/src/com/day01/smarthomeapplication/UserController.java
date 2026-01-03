package com.day01.smarthomeapplication;

class UserController {

    public void compareEnergy(Appliance a1, Appliance a2) {

        if (a1.getPower() > a2.getPower())
            System.out.println(a1.name + " uses more power");
        else if (a1.getPower() < a2.getPower())
            System.out.println(a2.name + " uses more power");
        else
            System.out.println("Both use equal power");
    }
}
