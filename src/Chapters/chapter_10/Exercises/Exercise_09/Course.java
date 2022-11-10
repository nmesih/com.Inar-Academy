package Chapters.chapter_10.Exercises.Exercise_09;

public class Course {
    private String courseName;
    private String[] students = new String[5];
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        if (numberOfStudents >= students.length) {
            String[] temp= new String[students.length * 2];
            System.arraycopy(students, 0, temp, 0, students.length);
            students = temp;
        }
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public void dropStudent(String student) {
        boolean isValid = false;
        for (int i = 0; i < students.length; i++) {
            if (student.equals((students[i]))) {
                if (i == students.length - 1) {
                    break;
                }
                for (int j = i; j < students.length - 1; j++) {
                    students[j] = students[j + 1];
                }
                isValid = true;
                numberOfStudents--;
            }
        }
        if(!isValid){
            System.out.println("Invalid input! There is no student named " + student);
        }
    }

    public String getCourseName() {
        return courseName;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }
    public void clear() {
        students = new String[100];
    }
}


