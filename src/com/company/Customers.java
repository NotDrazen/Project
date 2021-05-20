package com.company;

import java.util.ArrayList;
import java.util.Formatter;
import java.util.Objects;
import java.util.Scanner;

public class Customers {

    private Scanner scanner = new Scanner(System.in);
    private ArrayList<Customer> customers = new ArrayList<Customer>();
    private Formatter file;

    public void create(Customer customer){
        customers.add(customer);
    }

//    public void read(){
//        for(Customer c : customers){
//            System.out.println(c);
//        }
//    }

    public ArrayList<Customer> getCustomers(){
        return customers;
    }

//    public void Record(){
//        for(Customer c : customers){
//            file.format(c);
//        }
//    }

    public void search(String name,String pwd) {
        int flag = 0;
        int count = 3;

        for(Customer a : customers) {
            if (a.getName().compareTo(name) == 0 ){
                System.out.println("\nCustomer name  :" + a.getName());
                System.out.println("Room Number: " + a.getRoom_No());
                if (a.getPwd().compareTo(pwd) == 0) {
                    System.out.println("Door Unlocked.\n");
                    System.out.print("Would you like to request room cleaning?(Yes/No): ");
                    String req = scanner.nextLine();
                    break;
                } else {
                    for (int k = 0; k < 3; k++) {
                        System.out.print("You have " + count + " more tries!!");
                        System.out.print("\nInvalid Password! Enter again: ");
                        String input = scanner.nextLine();
                        if (input.compareTo(a.getPwd()) == 0) {
                            System.out.println("Account exists.");
                            break;
                        }else{
                            count--;
                            assert count > 0 : "System is locked! Contact Support";
                        }
                    }
                }
            }
            else {
                flag++;
                if(flag==customers.size()) {
                    System.out.println("Customer not found");
                }
            }
        }
    }
}

