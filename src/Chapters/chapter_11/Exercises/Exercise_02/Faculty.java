package Chapters.chapter_11.Exercises.Exercise_02;

import Chapters.chapter_10.Exercises.Exercise_14.MyDate;

public class Faculty extends Employee{
    private int officeHours;
    private String rank;

    public Faculty(){

    }
    public Faculty(String name, String address, String phoneNumber, String email, String office, double salary, MyDate hiredDate, int officeHours, String rank) {
        super(name, address, phoneNumber, email, office, salary, hiredDate);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public int getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(int officeHours) {
        this.officeHours = officeHours;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString(){
        return "Class name: Faculty\nName   : " + getName();
    }
}
