package Chapters.chapter_11.Exercises.Exercise_02;

import Chapters.chapter_10.Exercises.Exercise_14.MyDate;

public class Employee extends Person{

    private String office;
    private double salary;
    private MyDate hiredDate;

    public Employee() {

    }

    public Employee(String name, String address, String phoneNumber, String email, String office, double salary, MyDate hiredDate) {
        super(name, address, phoneNumber, email);
        this.office = office;
        this.salary = salary;
        this.hiredDate = hiredDate;
    }

    public String getOffice() {
        return office;
    }

    public double getSalary() {
        return salary;
    }

    public MyDate getHiredDate() {
        return hiredDate;
    }

    @Override
    public String toString(){
        return "Class name: Employee\nName  : " + getName();
    }
}
