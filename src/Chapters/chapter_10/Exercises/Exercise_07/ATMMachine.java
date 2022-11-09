package Chapters.chapter_10.Exercises.Exercise_07;

import java.util.Scanner;

public class ATMMachine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Account[] accounts = new Account[10];

        for (int i = 0; i < 10; i++) {
            accounts[i] = new Account(i, 100, 10);
        }
        System.out.println("Enter an id");
        int id = input.nextInt();

        int choice = 0;

        while(true){
            displayMainMenu();
            choice = input.nextInt();
            if(choice == 1){
                balance(accounts[id]);
            }
            if(choice == 2){
                withraw(accounts[id]);
            }
            if(choice == 3){
                deposit(accounts[id]);
            }
            if(choice == 4) {
                System.out.println("Enter an id");
                id = input.nextInt();
                continue;
            }
        }

        }


    private static void deposit(Account account) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an amount to deposit: ");
        int deposit = input.nextInt();
        if(account.getBalance() >= deposit){
            account.deposit(deposit);
        }else
            System.out.println("Insufficient balance of account");
    }

    private static void withraw(Account account) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an amount to withdraw: ");
        int withraw = input.nextInt();
        account.withdraw(withraw);
    }

    private static void balance(Account account) {
        System.out.println("The balance is " + account.getBalance());
    }

    private static void displayMainMenu() {
        System.out.println("Main menu " +
         "\n1: check balance \n2: withdraw \n3: deposit \n4: exit \nEnter a choice");
    }

}
