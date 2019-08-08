package com.company;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
public class Main {

    public static void main(String[] args) {
        Account bob = new Account(1112, 20000.00, 4.5, "Tarus, Bob");
        bob.withdraw(2500.00);
        bob.deposit(3000.00);
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        String strDate = dateFormat.format(bob.getDateCreated());
        System.out.println(String.format("%10s %15s %15s %15s %30s", "Account id", "Balance", "A.I.R", "M.I.R", "Date Created"));

        System.out.println(String.format("%10s %15.2f %15.2f %15.5f %30s" ,bob.getid(), bob.getBalance(), bob.getAnnualInterestRate(), bob.getMonthlyInterestRate()*100, strDate));
        System.out.println(bob.toString());
    }
}
