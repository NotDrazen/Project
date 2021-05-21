package com.company;
//ali

import java.io.Console;
import java.io.File;
import java.util.Formatter;
import java.util.Scanner;

public class Main {

    private static Scanner scanner;


    public static void main(String[] args) {


        scanner = new Scanner(System.in);

        Customer c1 = new Customer("Ali", "male", 20, 123456789,
                123456789, "ali@gmail.com", "abcd");

        Customer c2 = new Customer("Ahmed", "male", 20, 123456789,
                123456789, "ali@gmail.com", "abcd");


        Customer c3 = new Customer("Mujtaba", "male", 20, 123456789,
                123456789, "ali@gmail.com", "abcd");


        Customers customers = new Customers();
        customers.create(c1);
        customers.create(c2);
        customers.create(c3);


//            FileOutputStream writeData = new FileOutputStream("D:\\Java Practice\\Test.txt");
//            ObjectOutputStream writeStream = new ObjectOutputStream(writeData);
//
//            writeStream.writeObject(customers.getCustomers());
//            writeStream.flush();
//            writeStream.close();
//
//            catch (Exception e){
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

        RoomService roomService = new RoomService("Akmal", "Male", 20, 42010232, 0333333, "Ali@gmail.com");
        Receptionist receptionist = new Receptionist("Nasir", "Male", 20, 42010232, 0333333, "Ali@gmail.com");
        Manager manager = new Manager("Ali", "Male", 20, 42010232, 0333333, "Ali@gmail.com");
        Manager manager1 = new Manager("Kalu", "Male", 20, 42010232, 0333333, "Ali@gmail.com");

//        manager.working_hrs();
//        receptionist.working_hrs();
//        roomService1.working_hrs();

        System.out.println("1. Login\n2. Signup\n3. Management Info\n4. Exit\n");
        System.out.print("Option: ");
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                while (true) {
                    scanner.nextLine();
                    LoginPortal(customers, manager, receptionist, roomService);
                }
            case 2:
                scanner.nextLine();
                Main.SignUp(customers, manager, receptionist, roomService);
                while (true) {
                    scanner.nextLine();
                    LoginPortal(customers, manager, receptionist, roomService);
                }

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


    public static void LoginPortal(Customers customers, Manager manager, Receptionist receptionist, RoomService roomService) {
        int[] pincnfrm = {1111, 1112, 2222, 2223, 3333, 3334};
        int c = 3;
        int k = 0;

        System.out.println("NOTE: Incase of signup enter ' - ' in both fields.\n");
        System.out.print("Enter your Username : ");
        String name = scanner.nextLine();
        System.out.print("Enter your password : ");
        String pwd = scanner.nextLine();

        if (name.equals("-") && pwd.equals("-")) {
//            try {
//                Runtime.getRuntime().exec("cls");
//            } catch (Exception ex) {
//                System.out.println(ex.getMessage());
//            }
            Main.SignUp(customers, manager, receptionist, roomService);
        } else if ((name.equals(manager.getName()) || name.equals(roomService.getName()) || name.equals(receptionist.getName())) && pwd.equals("admin")) {
            System.out.print("Enter pin for specific designation: ");
            int pin = scanner.nextInt();

            loop:
                for (int i = 0; i < pincnfrm.length; i++) {

                     if (pincnfrm[i] == pin) {
                        k = 0;
                        if (pin == pincnfrm[0]) {
                            k = 1;
                            manager.increaseCheckin();
                            System.out.println(name + manager.status());
                        }
//                    else if(pin == pincnfrm[1]){
//                        manager.increaseCheckin();
//                        System.out.println(name + manager.status());
//                    }
                        else if (pin == pincnfrm[2]) {
                            k = 1;
                            receptionist.increaseCheckin();
                            System.out.println(name + receptionist.status());
                        }
//                    else if(pin == pincnfrm[3]){
//                        manager.increaseCheckin();
//                        System.out.println(name + manager.status());
//                    }
                        else if (pin == pincnfrm[4]) {
                            k = 1;
                            roomService.increaseCheckin();
                            System.out.println(name + roomService.status());
                        }
//                    else if(pin == pincnfrm[5]){
//                        manager.increaseCheckin();
//                        System.out.println(name + manager.status());
//                    }
                    }

                    else if(c == 0 && k == 0) {
                        assert false : "System is locked! Contact Support";
                    }

                    else if( (i == pincnfrm.length - 1) && (k == 0) ) {
                        for (int a = 0; a < pincnfrm.length; a++) {
                            scanner.nextLine();
                            System.out.printf("You have %d more tries!!", c);
                            System.out.print("\nInvalid Pin! Enter again: ");
                            pin = scanner.nextInt();
                            c--;
                            i = -1;
                            continue loop;
                        }
                    }
                }

        } else {
            customers.search(name, pwd);
            System.out.println("Do you want room cleaning(Yes/No): ");
            String select = scanner.nextLine();
            if(select.equalsIgnoreCase("Yes"))
            RoomService.requestService();
        }
    }

        public static void SignUp (Customers customers, Manager manager, Receptionist receptionist, RoomService roomService){
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
            if (pwd.equals(pwdcnfrm)) {
                System.out.println("Account created successfully!!");

                Customer c = new Customer(name, gender, age, CNIC, phone_Number, email, pwd);

                customers.create(c);
            } else {
                while (!pwd.equals(pwdcnfrm)) {
                    System.out.print("Wrong! Re-enter password: ");
                    pwdcnfrm = scanner.nextLine();
                    if (pwd.equals(pwdcnfrm)) {
                        System.out.println("Account created successfully!!");

                        Customer c = new Customer(name, gender, age, CNIC, phone_Number, email, pwd);

                        customers.create(c);
                    }
                }
            }
        }
    }

//    else {
//            for (int a = 0; a < pincnfrm.length; a++) {
//        scanner.nextLine();
//        System.out.print("You have " + c + " more tries!!");
//        System.out.print("\nInvalid Pin! Enter again: ");
//        pin = scanner.nextInt();
//        c--;
//        continue loop;
//        }
//        } new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();