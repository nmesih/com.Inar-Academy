package Chapters.chapter_11.Listings;

import java.util.Date;

public class SimpleGeometricObject {
    /*
     * -color: String
     * -filled: boolean
     * -dateCreated: java.util.Date
     * +GeometricObject()
     * +GeometricObject(color: String,
     *  filled: boolean)
     * +getColor(): String
     * +setColor(color: String): void
     * +isFilled(): boolean
     * +setFilled(filled: boolean): void
     * +getDateCreated(): java.util.Date
     * +toString(): String
     */

    private String color = "white";
    private boolean filled;
    private Date dateCreated;

    public SimpleGeometricObject(){
        dateCreated = new Date();
    }

    public SimpleGeometricObject(String color, boolean filled){
        dateCreated = new Date();
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public String toString(){
        return "created on " + dateCreated + "\ncolor: " + color +
                " and filled: " + filled;
    }
}
