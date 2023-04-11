package com.bank;

public class Bank {

    int accountId;
    protected String customerName;
    public String bankName;
    private float balance;

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    private void credit(float balance){
        this.balance=this.balance+balance;
        System.out.println("New Balance is:"+this.balance);
    }

    //Default method
    void debit(float balance){
        if(balance>this.balance){
            System.out.println("You cannot debit");
        }
        else{
            this.balance=this.balance-balance;
            System.out.println("Your remaining balance:"+this.balance);
        }
    }

    protected void checkBalance(){
        System.out.println("Balance is:"+this.balance);
    }

    public String display() {
        return "accountId=" + accountId + '\n' + "customerName='" + customerName + '\n' + "bankName='" + bankName + '\n' + "balance=" + balance + '\n';
    }

    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.accountId = 104;
        bank.customerName = "Mihir";
        bank.bankName = "Kotak Bank";
        bank.balance=20000;

        System.out.println(bank.display());
        bank.credit(1000);
        bank.debit(5000);
        bank.checkBalance();
    }
}
