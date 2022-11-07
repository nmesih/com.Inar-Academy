package Chapters.chapter_10.Listings.Listing_03_04_BMI;

public class UseBMIClass {
    public static void main(String[] args) {
        BMI bmi1 = new BMI("Lionel Messi" , 34, 170, 70);
        System.out.println("The BMI for " + bmi1.getName() + " is " +
                bmi1.getBMI() + " " + bmi1.getStatus());

        BMI bmi2 = new BMI("Cristiano Ronaldo" , 200, 80);
        System.out.println("The BMI for " + bmi2.getName() + " is " +
                bmi2.getBMI() + " " + bmi2.getStatus());
    }
}
