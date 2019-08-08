package com.company;

import java.util.Date;

public class Transaction extends Account {
    private Date date;
    private char type;
    private double amount;
    private double balance;
    private String description;

    Transaction(double b) {
        date = new Date();
        type = '-';
        amount = 0;
        balance = b;
        description = "none";
    }

    Transaction(char j, double a, double b) {
        date = new Date();
        type = j;
        amount = a;
        balance = b;
        description = "none";
    }
    Transaction (char j, double a, double b, String d){
        date = new Date();
        type = j;
        amount = a;
        balance = b;
        description = d;
    }
    public String getDate() {
        String s = date.toString();
        return s;
    }

    public char getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public String getDescription() {
        return description;
    }

    public double getBalance(){
        return this.balance;
    }

    public String toString() {
        return "\n Date of Transaction: " + this.getDate() + "\n Balance: "+getBalance() + "\n Description: " + getDescription() + "\n Type: " + getType() + "\n Amount: " + getAmount()+"\n";
    }
}
