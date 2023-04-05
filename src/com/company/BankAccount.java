package com.company;

public class BankAccount {

    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;
    private String bankName;
    private String bankBranch;


   public BankAccount() {
        this("default number", 0.00, "Default Name", "Default address", "default phone","State bank", "Hyderabad");
        System.out.println("got into the empty constructor");
    }

    public BankAccount(String accountNumber, double balance, String customerName, String email, String
        phoneNumber, String bankName, String bankBranch){
        System.out.println("Account constructed with parameters is called here");
            this.accountNumber = accountNumber;
            this.balance = balance;
            this.customerName = customerName;
            this.email = email;
            this.phoneNumber = phoneNumber;
            this.bankName = bankName;
            this.bankBranch = bankBranch;

        }

    public BankAccount(String accountNumber, double balance, String customerName, String email, String
            phoneNumber){
        this(accountNumber,1000.23, customerName, email, phoneNumber,"State bank of", "Delhi");
    }


    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankBranch() {
        return bankBranch;
    }

    public void setBankBranch(String bankBranch) {
        this.bankBranch = bankBranch;
    }

    public void Deposit(double deposit) {
        this.balance = this.balance + deposit;
        System.out.println("Customer deposited: "+deposit+" The current balance is:" + this.balance);
    }

    public void Withdraw(double withdraw) {
        if (withdraw > balance) {
            System.out.println("Insufficient Funds");
        } else {
            this.balance = this.balance - withdraw;
            System.out.println("Amount withdrawn:" + withdraw + " The current balance in your account is:" + this.balance);
        }
    }
}
