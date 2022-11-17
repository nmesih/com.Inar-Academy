package Chapters.chapter_11.Exercises.Exercise_08;

public class Exercise_08 {
    public static void main(String[] args) {
        /* Write a test program that creates an Account with annual interest rate 1.5%,
           balance 1000, id 1122, and name George. Deposit $30, $40, and $50 to the
           account and withdraw $5, $4, and $2 from the account.
           Print an account summary that shows account holder name, interest rate, balance, and all transactions.
         */

        Account1 george = new Account1("George",1122,1000,1.5);
        george.deposit(30);
        george.deposit(40);
        george.deposit(50);
        george.withdraw(5);
        george.withdraw(4);
        george.withdraw(2);

        System.out.println(george);
    }
}
