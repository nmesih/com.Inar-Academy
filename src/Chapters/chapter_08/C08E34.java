package Chapters.chapters_08;

public class C08E34 {
    public static void main(String[] args) {
        System.out.println("Enter 6 points: ");
        double[][] points = new double[6][2];
        C08E32.initializingArraysWithInputValues(points);
        System.out.println("The rightmost lowest point is (" + getRightmostLowestPoint(points)[0] + ", " + getRightmostLowestPoint(points)[1] + ")");

    }
    public static double[] getRightmostLowestPoint(double[][] points){
        double[] lowestPoint;

        lowestPoint = points[0];

        for (int i = 1; i < points.length; i++) {

            if (points[i][1] < lowestPoint[1]) {

                lowestPoint = points[i];
            } else if (points[i][1] == lowestPoint[1] && points[i][0] > lowestPoint[0]) {

                lowestPoint = points[i];
            }
        }
        return lowestPoint;


    }
}
