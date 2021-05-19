package com.company;

public class Receptionist extends Staff{
    public Receptionist(String name, String gender, int age, long NIC, int phone_Number, String email) {
        super(name, gender, age, NIC, phone_Number, email);
        setDesignation("Receptionist");
    }

    @Override
    public void working_hrs() {
        System.out.println("Receptionist Working hours are 9 am to 7 pm");
    }

    @Override
    public String status() {
        return " "+this.getDesignation()+ " has check in "+this.getCheckIn()+ " times";
    }
}
