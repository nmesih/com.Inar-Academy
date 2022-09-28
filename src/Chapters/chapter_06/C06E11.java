package Chapters.chapter_06;

public class C06E11 {
    public static void main(String[] args) {
        System.out.printf("%-15s%-15s" , "Sales Amount" , "Commission");
        System.out.print("\n-------------------------------");
        for (int i = 10000; i <= 100000 ; i += 5000) {
            System.out.printf("\n%-15d%7.1f", i ,computeCommission(i));
        }

    }
    public static double computeCommission(double salesAmount){
        double commision = 0;
        commision += ((salesAmount - 10000) * 0.12) + (500) +(5000 * 0.08);
        return commision;
    }

}
