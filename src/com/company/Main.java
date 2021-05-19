package com.company;


import java.io.Console;
import java.util.Scanner;

public class Main {

    private static Person person;
    private static Scanner scanner;


    public static void main(String[] args){

        scanner = new Scanner(System.in);

        Customer c1 = new Customer("Ali","male",20,123456789,
                123456789,"ali@gmail.com","abcd");

        Customer c2 = new Customer("Ahmed","male",20,123456789,
                123456789,"ali@gmail.com","abcd");


        Customer c3 = new Customer("Mujtaba","male",20,123456789,
                123456789,"ali@gmail.com","abcd");


        Customers customers = new Customers();
        customers.create(c1);
        customers.create(c2);
        customers.create(c3);

//        try{
//            FileOutputStream writeData = new FileOutputStream("D:\\Java Practice\\Test.txt");
//            ObjectOutputStream writeStream = new ObjectOutputStream(writeData);
//
//            writeStream.writeObject(customers.getCustomers());
//            writeStream.flush();
//            writeStream.close();
//
//        }catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        try{
//            FileInputStream readData = new FileInputStream("D:\\Java Practice\\Test.txt");
//            ObjectInputStream readStream = new ObjectInputStream(readData);
//
//            readStream.close();
//            System.out.println(customers.getCustomers().toString());
//        }catch (Exception e) {
//            e.printStackTrace();
//        }


        //customers.read();

        System.out.println("\n                    ====>      Welcome to the Hotel Management System      <====\n");

        RoomService roomService = new RoomService("Akmal","Male",20,42010232,0333333, "Ali@gmail.com");
        Receptionist receptionist = new Receptionist("Nasir","Male",20,42010232,0333333, "Ali@gmail.com");
        Manager manager = new Manager("Ali","Male",20,42010232,0333333, "Ali@gmail.com");
//        manager.working_hrs();
//        receptionist.working_hrs();
//        roomService1.working_hrs();

        System.out.println("1. Login\n2. Signup\n3. Management Info\n4. Exit\n");
        System.out.print("Option: ");
        int option = scanner.nextInt();
        scanner.nextLine();
        switch (option){
            case 1:
                while (true) {
                    try {

                        LoginCustomer(customers, manager, receptionist, roomService);
                    }
                    catch(Exception ex){
                        System.out.println(ex.getMessage());
                    }
                }

            case 2:
                Main.SignUp(customers);
                break;

            case 3:
                System.out.println();
                manager.working_hrs();
                receptionist.working_hrs();
                roomService.working_hrs();
                break;

            case 4:
                break;
        }


//        System.out.print("Do you want to Login or Sign up? ");
//        String detail1 = scanner.nextLine();
//        if(detail1.equalsIgnoreCase("Login")) {
//            System.out.print("Login as Customer or Admin : ");
//            String detail2 = scanner.nextLine();
//            if (detail2.equalsIgnoreCase("Customer")) {
//                // Customer login function
//      //id(enter "-" if account doesnt exist):
//            }
//        }
//            else if(detail2.equalsIgnoreCase("Admin")){
//                // Admin login function
//            }
//        }else if(detail1.equalsIgnoreCase("Sign up")){
//            //sign up function
//        }




//        manager.increaseCheckin();
//        System.out.println(manager.status());
//        manager.increaseCheckin();
//        manager.increaseCheckin();
//        System.out.println(manager.status());

//
//        System.out.println("\n");
//
//        Receptionist receptionist = new Receptionist("Nasir","Male",20,42010232,0333333, "Ali@gmail.com");
//        receptionist.increaseCheckin();
//        System.out.println(receptionist.status());
//        receptionist.increaseCheckin();
//        receptionist.increaseCheckin();
//        System.out.println(receptionist.status());
//
//
//        System.out.println("\n");
//
//
//        roomService1.increaseCheckin();
//        System.out.println(roomService1.status());
//        roomService1.increaseCheckin();
//        System.out.println(roomService1.status());
//        roomService1.requestService();
//
//        roomService1.requestService();
//
//        System.out.println("\n");
//
//        RoomService roomService2 = new RoomService("Parvez","Male",20,42010232,0333333, "Ali@gmail.com");
//        roomService2.increaseCheckin();
//        System.out.println(roomService2.status());
//        roomService2.requestService();
//        roomService2.working_hrs();
    }

//    public static void clearScreen() throws IIOException {
//        try {
//            Runtime.getRuntime().exec("cls");
//        }
//        catch (IIOException ex){
//            System.out.println(ex.getMessage());
//        }
//
//    }

    public static void LoginCustomer(Customers customers, Manager manager, Receptionist receptionist, RoomService roomService) throws Exception{
        System.out.println("NOTE: Incase of signup enter ' - ' in both fields.\n");
        System.out.print("Enter your Username : ");
        String name = scanner.nextLine();
        System.out.print("Enter your password : ");
        String pwd = scanner.nextLine();

        if(name.equals("-") && pwd.equals("-")) {
            try {
                Runtime.getRuntime().exec("cls");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            Main.SignUp(customers);
        }

        else if((name.equals(manager.getName()) || name.equals(roomService.getName()) || name.equals(receptionist.getName())) && pwd.equals("admin")){
            System.out.print("Enter pin for specific designation: ");
            String pin = scanner.nextLine();

            switch (pin){
                case "1111":
                    manager.increaseCheckin();
                    System.out.println(name + manager.status());
                    break;

//                case "1112":
//                    System.out.println(name + manager.status());
//                    break;

                case "2222":
                    receptionist.increaseCheckin();
                    System.out.println(name + receptionist.status());
                    break;

//                case "2223":
//                    System.out.println(name + manager.status());
//                    break;

                case "3333":
                    roomService.increaseCheckin();
                    System.out.println(name + roomService.status());
                    break;

//                case "3334":
//                    System.out.println(name + manager.status());
//                    break;
            }
        }

        else {
            customers.search(name, pwd);
        }
    }

    public static void SignUp(Customers customers){
        System.out.print("\nSIGN UP\n");

        System.out.print("Enter your name : ");
        String name = scanner.nextLine();
        System.out.print("Enter your age : ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter your gender : ");
        String gender = scanner.nextLine();
        System.out.print("Enter your email : ");
        String email = scanner.nextLine();
        System.out.print("Enter your CNIC number : ");
        Long CNIC = scanner.nextLong();
        System.out.print("Enter your phone number : ");
        int phone_Number = scanner.nextInt();
        System.out.println();
        scanner.nextLine();
        System.out.println("Your name will be used as username for your account.");
        System.out.print("Set password for your account : ");
        String pwd = scanner.nextLine();
        System.out.print("Confirm password: ");
        String pwdcnfrm = scanner.nextLine();
        if(pwd.equals(pwdcnfrm)) {

            Customer c = new Customer(name, gender, age, CNIC, phone_Number, email, pwd);

            customers.create(c);
        }
        else {
            while (true){
                System.out.print("Wrong! Re-enter password: ");
                pwdcnfrm = scanner.nextLine();
                if(pwd.equals(pwdcnfrm)){
                    break;
                }
            }
        }
    }
}

