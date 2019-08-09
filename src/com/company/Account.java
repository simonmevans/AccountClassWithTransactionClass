package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    private ArrayList<Transaction> transactions;
    private String name;

    Account() {
        id = 0;
        balance = 0;
        annualInterestRate = 0;
        dateCreated = new Date();
        transactions = new ArrayList<Transaction>();
        name = "unknown";

    }

    Account(int d, double b, double AIR, String n) {
        id = d;
        balance = b;
        annualInterestRate = AIR;
        dateCreated = new Date();
        name = n;
        transactions = new ArrayList<Transaction>();
    }

    public int getid() {
        return id;
    }

    public void setid(int num) {
        id = num;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public double getMonthlyInterestRate() {
        return (annualInterestRate / 100) / 12;
    }

    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

    public void withdraw(double amount) {
        if ((balance -= amount) >= 0) {
            balance -= amount;
            Transaction transaction = new Transaction('W', amount, getBalance());
            this.transactions.add(transaction);
        } else
            System.out.println("!!!Transaction Canceled not enough funds");

    }

    public void withdraw(double amount, String description) {
        if ((balance -= amount) >= 0) {
            balance -= amount;
            Transaction transaction = new Transaction('W', amount, getBalance(), description);
            this.transactions.add(transaction);
        } else
            System.out.println("!!!Transaction Canceled not enough funds");

    }

    public void deposit(double amount, String description) {
        balance += amount;
        Transaction transaction = new Transaction('D', amount, getBalance(), description);
        this.transactions.add(transaction);

    }

    public void deposit(double amount) {
        balance += amount;
        Transaction transaction = new Transaction('D', amount, getBalance());
        this.transactions.add(transaction);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Account Info :\n Name: " + getName() + "\n Created: " + getDateCreated() + "\n Balance: " + getBalance() + " \n Monthly Int: " + getMonthlyInterest() + "\n AIR: " + getAnnualInterestRate() +
                "\n     Transaction List" + "\n     ----------------\n" + transactions.toString();
    }
}