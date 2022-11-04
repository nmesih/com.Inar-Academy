package Chapters.chapter_09.Exercises.Exercise_08;

public class Fan {
    final static int slow = 1;
    final static int medium = 2;
    final static int fast = 3;
    private int speed;
    private boolean on;
    private double radius;
    String color;

    public Fan(){
        speed = slow;
        on = false;
        radius = 5;
        color = "blue";
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String toString() {
        if (on) {
            return "Fan is on" + "\nSpeed : " + getSpeed() +
                    "\nRadius: " + getRadius() + "\nColor : " + getColor();
        }else
            return "Fan is off" + "\nSpeed : " + getSpeed() +
                    "\nRadius: " + getRadius() + "\nColor : " + getColor();
    }
}


