package com.main;

import com.bank.Bank;

public class Main extends Bank {

    public static void main(String[] args) {

        Bank bank = new Bank();
        bank.setAccountId(101);
        bank.setCustomerName("Shailesh");
        bank.bankName = "Bank of India";
        bank.setBalance(5000);
        System.out.println(bank.display());
        //bank.checkBalance()  Error:This method is protected so outside package only subclass can access.

        Main main = new Main();
        //main.accountId=102  Error:accountId is default.So cannot be accessed from outside package
        main.setAccountId(102);
        main.customerName = "Kiran";
        main.bankName = "Axis Bank";
        //main.balance=10000  Error:balance is private.So it can access only within class
        main.setBalance(10000);
        System.out.println(main.display());
        main.checkBalance();


    }
}
