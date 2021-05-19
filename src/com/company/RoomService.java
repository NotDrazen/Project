package com.company;

public class RoomService extends Staff{

    private static int count=0;

    public RoomService(String name, String gender, int age, long NIC, int phone_Number, String email) {
        super(name, gender, age, NIC, phone_Number, email);
        setDesignation("Room Service");
        count++;
    }

    public static int getCount() {
        return count;
    }

    public boolean checkStaff(){
        if(count>0) {
            return true;
        }
        return false;
    }

    public void requestService(){
        if(checkStaff()) {
            System.out.println(count + " Room service staff available");
            System.out.println(getName() + " is coming");
            count--;
        }
        else{
            System.out.println("Room service unavailable");
        }
    }

    @Override
    public void working_hrs() {
        System.out.println("RoomService Working hours are 9 am to 9 pm");
    }

    @Override
    public String status() {
        return " "+getDesignation()+" has check in "+getCheckIn()+ " times";
    }

}
