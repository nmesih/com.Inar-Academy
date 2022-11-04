package Chapters.chapter_09.Exercises.Exercise_07;

public class TestAccount {
    public static void main(String[] args) {

        Account newAccount = new Account(1122, 20000, 4.5);
        newAccount.withdraw(2500);
        newAccount.deposit(3000);
        System.out.println("Balance is " + newAccount.getBalance());
        System.out.println("The monthly interest " + newAccount.getMonthlyInterest());
        System.out.println("Date is " + newAccount.getDateCreated());
    }
}
