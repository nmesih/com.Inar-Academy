package Chapters.chapter_11.Exercises.Exercise_03;

public class CheckingAccount extends Account {

    private double limit;

    public CheckingAccount() {
        super();
        limit = 0;
    }

    public CheckingAccount(int id, double balance, double limit) {
        super(id, balance);
        this.limit = limit;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    @Override
    public void withdraw(double amount){
        if(getBalance() - amount > limit){
            setBalance(getBalance()-amount);
        }else
            System.out.println("You cannot withdraw this amount!");
    }

    @Override
    public String toString() {
        return super.toString() + "\nThe overdraft limit is " + limit + " $";
    }
}
