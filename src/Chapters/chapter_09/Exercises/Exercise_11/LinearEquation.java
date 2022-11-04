package Chapters.chapter_09.Exercises.Exercise_11;

public class LinearEquation {

    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;

    public LinearEquation(double a,double b,double c,double d,double e,double f){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public double getF() {
        return f;
    }
    public boolean isSolvable(){
        if(getA() * getD() - getB() * getC() == 0){
            return false;
        }else
            return true;
    }
    public double getX(){
        return ((getE() * getD() - getB() * getF()) / (getA() * getD() - getB() * getC()));
    }
    public double getY(){
        return ((getA() * getF() - getE() * getC()) / (getA() * getD() - getB() * getC()));
    }
}
