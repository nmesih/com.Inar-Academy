package Chapters.chapters_08;

public class C08E31 {
    public static void main(String[] args) {
        double[][] points = new double[4][2];
        System.out.println("Enter x1, y1, x2, y2, x3, y3, x4, y4:");
        C08E30.initializingArraysWithInputValues(points);

        double[] intersectingPoint = getIntersectingPoint(points);
        if (intersectingPoint == null) {
            System.out.println("The two lines are parallel.");
        } else {
            System.out.printf("The intersecting point is at (%.3f%2s%.3f%s", intersectingPoint[0], " , ", intersectingPoint[1], ")");

        }
    }
    public static double[] getIntersectingPoint(double[][] points){
        double[] intersectionPoint = new double[2];

        double a = points[0][1] - points[1][1];
        double b = -(points[0][0] - points[1][0]);
        double e = a * points[0][0] - (points[0][0] - points[1][0]) * points[0][1];
        double c = (points[2][1] - points[3][1]);
        double d = -(points[2][0] - points[3][0]);
        double f = c * points[2][0] - (points[2][0] - points[3][0]) * points[2][1];

        intersectionPoint[0] = (e * d - b * f) / (a * d - b * c);
        intersectionPoint[1] = (a * f - e * c) / (a * d - b * c);

        double result = (a * d) - (b * c);
        if(result == 0){
            return null;
        }
        return intersectionPoint;
    }
}
