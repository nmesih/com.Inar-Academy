package Chapters.chapter_11.Exercises.Exercise_03;

public class SavingsAccount extends Account {

    public SavingsAccount() {
        super();
    }

    public SavingsAccount(int id, double balance) {
        super(id, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() > amount) {
            setBalance(getBalance() - amount);
        } else
            System.out.println("You cannot withdraw this amount!");
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
