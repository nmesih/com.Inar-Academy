package Chapters.chapter_11.Exercises.Exercise_06;


import Chapters.chapter_10.Listings.Listing_01_02_Loan.Loan;
import Chapters.chapter_11.Listings.CircleFromSimpleGeometricObject;
import java.util.ArrayList;
import java.util.Date;

public class Exercise_06 {
    public static void main(String[] args) {

        ArrayList<Object> list = new ArrayList<>();
        list.add(new Loan());
        list.add(new Date());
        list.add("arraylist");
        list.add(new CircleFromSimpleGeometricObject());
        toString(list);

    }

    private static void toString(ArrayList<Object> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }



}
