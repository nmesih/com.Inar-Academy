package Chapters.chapter_10.Checkpoints;

import com.oracle.xmlns.internal.webservices.jaxws_databinding.SoapBindingParameterStyle;

public class Checkpoint_08_10_11 {
    public static void main(String[] args) {
        System.out.println("Checkpoint 08");
        Integer i = new Integer("23");
        Integer a = new Integer(23);
        Integer b = Integer.valueOf("23");
        Integer c = Integer.parseInt("23", 8);
        Double d = Double.valueOf("23.45");
        int e = (Integer.valueOf("23")).intValue();
        double f = (Double.valueOf("23.4")).doubleValue();
        int g = (Double.valueOf("23.4")).intValue();
        String h = (Double.valueOf("23.4")).toString();
        System.out.println("i : " + i);
        System.out.println("a : " +a);
        System.out.println("b : " +b);
        System.out.println("c : " +c);
        System.out.println("d : " +d);
        System.out.println("e : " +e);
        System.out.println("f : " +f);
        System.out.println("g : " +g);
        System.out.println("h : " +h);

        System.out.println("Checkpoint 10");
        Integer x = new Integer(3);
        System.out.println(x.intValue());
        System.out.println(x.compareTo(new Integer(4)));

        System.out.println("Checkpoint 11");
        System.out.println(Integer.parseInt("10"));
        System.out.println(Integer.parseInt("10", 10));
        System.out.println(Integer.parseInt("10", 16));
        System.out.println(Integer.parseInt("11"));
        System.out.println(Integer.parseInt("11", 10));
        System.out.println(Integer.parseInt("11", 16));
    }
}