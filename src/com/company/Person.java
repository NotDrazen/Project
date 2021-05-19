package com.company;

public abstract class Person{
    private String name;
    private String gender;
    private int age;
    private long NIC;
    private int phone_Number;
    private String email;


    public Person(String name, String gender, int age, long NIC, int phone_Number, String email) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.NIC = NIC;
        this.phone_Number = phone_Number;
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setNIC(long NIC) {
        this.NIC = NIC;
    }

    public void setPhone_Number(int phone_Number) {
        this.phone_Number = phone_Number;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public long getNIC() {
        return NIC;
    }

    public int getPhone_Number() {
        return phone_Number;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", NIC=" + NIC +
                ", phone_Number='" + phone_Number + '\'' +
                ", email='" + email + '\'' +
                "}";
    }

}
