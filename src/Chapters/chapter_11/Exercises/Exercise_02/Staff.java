package Chapters.chapter_11.Exercises.Exercise_02;

import Chapters.chapter_10.Exercises.Exercise_14.MyDate;

public class Staff extends Employee {
    private String title;

    public Staff(String name, String address, String phoneNumber, String email, String office, double salary, MyDate hiredDate, String title) {
        super(name, address, phoneNumber, email, office, salary, hiredDate);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString(){
        return "Class name: Staff\nName    :" + getName();
    }
}
