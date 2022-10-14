package Chapters.chapter_07;

public class C07E23 {
    public static void main(String[] args) {
        boolean [] doors = new boolean[100];
        int numberOfStudents = 100;
        updateDoor(numberOfStudents, doors);
        displayOpenDoors(doors);
    }

    public static void updateDoor(int numberOfStudents, boolean[] doors) {
        for (int student = 1; student < numberOfStudents; student++) {

            for (int doorNumber = 0; doorNumber <doors.length; doorNumber += student) {
                if(doors[doorNumber]){
                    doors[doorNumber] = false;
                } else {
                    doors[doorNumber] = true;
                }
            }
        }
    }

    public static void displayOpenDoors(boolean[] doors) {
        System.out.println("The doors that are open: ");
        for (int i = 0; i < doors.length; i++) {
            if (doors[i]){
                System.out.print((i+1) + " ");
            }
        }
    }
}
