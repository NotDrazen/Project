package com.company;

public class Manager extends Staff{

    public Manager(String name, String gender, int age, long NIC, int phone_Number, String email) {
        super(name, gender, age, NIC,phone_Number, email);
        setDesignation("Manager");
    }

    @Override
    public void working_hrs() {
        System.out.println("Manager Working hours are 9 am to 4 pm");
    }

    @Override
    public String status() {
        return " "+getDesignation()+" has check in "+getCheckIn()+ " times";
    }
}
