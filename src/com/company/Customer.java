package com.company;

import java.io.Serializable;

public class Customer extends Person implements Serializable {

    private int room_No;
    private String pwd;
    private static int count = 0;

    public Customer(String name, String gender, int age, long NIC,
                    int phone_Number, String email, String pwd) {
        super(name, gender, age, NIC, phone_Number, email);
        count++;
        this.room_No=count;
        this.pwd=pwd;
    }

    public void setRoom_No(int room_No) {
        this.room_No = room_No;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public int getRoom_No() {
        return room_No;
    }

    public String getPwd() {
        return pwd;
    }

}
