package Chapters.chapter_11.Exercises.Exercise_02;

import Chapters.chapter_10.Exercises.Exercise_14.MyDate;

public class E_02 {
    public static void main(String[] args) {
        Person person = new Person("Nuri", "İzmir", "0555555555" , "nuri@hotmail.com");
        System.out.println(person);
        print(person);
        System.out.println();

        Student student = new Student("Ali", "Istanbul" , "05555544444" , "ali@gmail.com", 1);
        System.out.println(student);
        print(student);
        System.out.println("Class status: " + student.getStatus());
        System.out.println();

        Employee employee = new Employee("Mehmet", "Ankara" , "0544555555", "mehmet@gmail.com", "502" , 100000, new MyDate());
        System.out.println(employee);
        print(employee);
        System.out.println("Office : " + employee.getOffice() + "\nSalary: " + employee.getSalary());
        System.out.println();

        Faculty faculty = new Faculty("Fatma", "Antalya" , "0524000000" , "fatma@hotmail.com" ,
                "E300", 150000, new MyDate() ,8 , "Manager");
        System.out.println(faculty);
        print(faculty);
        System.out.println("Office : " + faculty.getOffice() + "\nSalary: " + faculty.getSalary() +
                "\nOffice hours: " + faculty.getOfficeHours() + "\nRank:  " + faculty.getRank());
        System.out.println();

        Staff staff = new Staff("Erhan", "Mersin" , "0555557777" , "erhan@hotmail.com" ,
                "555", 85000, new MyDate(), "Profesor");
        System.out.println(staff);
        print(staff);
        System.out.println("Office : " + staff.getOffice() + "\nSalary: " + staff.getSalary() +
                "\nTitle    : " + staff.getTitle());
    }

    private static void print(Person person) {
        System.out.println("Adress : " + person.getAddress() + "\nPhone  : " + person.getPhoneNumber() +
                "\nEmail  : " + person.getEmail());
    }
}
