package com.company;

public abstract class Staff extends Person{

    private int checkIn=0;
    private String Designation;

    public Staff(String name, String gender, int age, long NIC, int phone_Number, String email) {
        super(name, gender, age, NIC, phone_Number, email);
    }

    public void setDesignation(String designation) {
        Designation = designation;
    }

    public void setCheckIn(int checkIn) {
        this.checkIn = checkIn;
    }

    public int getCheckIn() {
        return checkIn;
    }

    public String getDesignation() {
        return Designation;
    }

    public void increaseCheckin(){
        checkIn++;
    }

    public abstract String status();
    public abstract void working_hrs();
}
