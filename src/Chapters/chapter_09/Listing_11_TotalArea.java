package Chapters.chapter_09;

public class Listing_11_TotalArea {
    public static void main(String[] args) {
        Listing_08_CircleWithPrivateDataFields[] circleArray;

        circleArray = createCircleArray();

        printCircleArray(circleArray);

    }
    public static Listing_08_CircleWithPrivateDataFields[] createCircleArray(){
        Listing_08_CircleWithPrivateDataFields[] circleArray = new Listing_08_CircleWithPrivateDataFields[5];

        for (int i = 0; i < circleArray.length; i++) {
            circleArray[i] = new Listing_08_CircleWithPrivateDataFields(Math.random()*100);

        }
        return circleArray;
    }

    public static void printCircleArray(Listing_08_CircleWithPrivateDataFields[] circleArray){
        System.out.printf("%-30s%-15s\n", "Radius", "Area");
         for (int i = 0; i < circleArray.length; i++) {
             System.out.printf("%-30f%-15f\n", circleArray[i].getRadius(),
                     circleArray[i].getArea());
             }
        
         System.out.println("—————————————————————————————————————————-");
         
         // Compute and display the result
         System.out.printf("%-30s%-15f\n", "The total area of circles is", sum(circleArray) );
    }

    public static double sum(Listing_08_CircleWithPrivateDataFields[] circleArray) {
        double sum = 0;
        for (int i = 0; i < circleArray.length; i++) {
            sum += circleArray[i].getArea();
        }
        return sum;
    }
}
