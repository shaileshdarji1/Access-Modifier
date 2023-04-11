package com.bank;

public class Account {

    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.accountId = 103;
        bank.customerName = "Paresh";
        bank.bankName = "HDFC Bank";
        //bank.balance=15000  Error:balance is private variable.so outside class not accessible.
        bank.setBalance(15000);
        System.out.println(bank.display());
        //bank.credit(1000)  Error:Credit cannot access here.because it's private
        bank.debit(5000);
        bank.checkBalance();
    }
}
