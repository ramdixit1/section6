package com.company;

public class vipCustomer {
    private String name;

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }

    private double creditLimit;
    private String email;

    public vipCustomer() {
        this("defaultName",0.03,"default@gmail.com");
    }

    public vipCustomer(String name,double creditLimit){
        this(name,creditLimit,"unknw@gmail.com");
    }

    public vipCustomer(String name,double creditLimit,String email){
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }
}
