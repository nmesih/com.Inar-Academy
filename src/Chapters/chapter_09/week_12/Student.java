package Chapters.chapter_09.week_12;

public class Student {

    static int studentCounter = 0;
    String name;
    String surname;
    int id;
    String email;


    public Student(){
        this("", "", 0 , "");
    }

    public Student(String name, String surname, int id, String email){
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.email = email;
        studentCounter++;

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {this.name = name;}

    public String getSurname() {return this.surname;}

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getId() {return this.id;}

    public void setId(int id) {this.id = id;}

    public String getEmail() {return this.email;}

    public void setEmail(String email) {this.email = email;}

    public void print(){
        System.out.printf("\nStudent's name %4s%s" ,":", name);
        System.out.printf("\nStudent's surname %s%s", ":" , surname);
        System.out.printf("\nStudent's id %6s%s", ":", id);
        System.out.printf("\nStudent's e-mail %2s%s", ":", email);
    }
}

