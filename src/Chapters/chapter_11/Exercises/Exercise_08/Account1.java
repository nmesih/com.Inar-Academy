package Chapters.chapter_11.Exercises.Exercise_08;

import java.util.ArrayList;
import java.util.Date;

public class Account1 {
    private String name;
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated = new Date();
    protected ArrayList<Transaction> list = new ArrayList<>();

    public Account1(){

    }

    public Account1(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public Account1(String name, int id, double balance) {
        this.name = name;
        this.id = id;
        this.balance = balance;
    }

    public Account1(String name, int id, double balance, double annualInterestRate) {
        this.name = name;
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        dateCreated = new Date();
        list = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRte(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate() {
        return (annualInterestRate / 100) / 12;
    }

    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

    public void withdraw(double value) {
        if (balance < value) {
            System.out.println("Your balance is insufficient to withdraw this amount\n" +
                    "Your balance is " + this.balance);
        } else {
            setBalance(getBalance() - value);
            Transaction transaction = new Transaction('W', value, balance, "$" + value + " withdrawn");
            list.add(transaction);
        }
    }

    public void deposit(double value) {
        setBalance(getBalance() + value);
        Transaction transaction = new Transaction('D', value, balance, "$" + value + " deposited");
        list.add(transaction);
    }


    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
        }
        return "Name    : " + name + "\nBalance : " + getBalance() +
                "\nmonthly interest: " + getMonthlyInterest() +
                "\ndate created: " + getDateCreated() +
                "\ntransactions: \n\n" + sb;  }
}
