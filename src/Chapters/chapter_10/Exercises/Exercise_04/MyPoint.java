package Chapters.chapter_10.Exercises.Exercise_04;

public class MyPoint {
    private double x;
    private double y;

    public MyPoint(){
        this(0, 0);
    }
    public MyPoint(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    public double distance(MyPoint point) {
        double x = Math.pow(getX() - point.getX(),2);
        double y = Math.pow(getY() - point.getY(),2);

        return Math.sqrt(x+y);
    }
    public double distance(double x, double y) {
        double dX = (Math.pow(getX() - x, 2));
        double dY = (Math.pow(getY() - y, 2));

        return Math.sqrt(dX + dY);
    }
}
