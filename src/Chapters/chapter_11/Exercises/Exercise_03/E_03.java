package Chapters.chapter_11.Exercises.Exercise_03;

public class E_03 {
    public static void main(String[] args) {

        CheckingAccount checkingAccount = new CheckingAccount(35, 350000, 100000);
        SavingsAccount savingsAccount = new SavingsAccount(157, 10000);

        checkingAccount.withdraw(300000);
        System.out.println(checkingAccount.toString());

        System.out.println("----------------------");

        savingsAccount.withdraw(10052);
        System.out.println(savingsAccount.toString());
    }

}
