package Chapters.chapter_06;

public class C06E13 {
    public static void main(String[] args) {
        System.out.printf("%-10s%-10s", "i", "m(i)");
        System.out.println("\n-------------------");
        for (int i = 1; i <= 20; i++) {
            System.out.printf("%-10d%-10.4f", i, sumSeries(i));
            System.out.println();
        }
    }

    public static double sumSeries(int b) {
        double sum = 0;
        for (int i = 1; i <= b; i++) {
            sum += 1.0 * i / (i + 1);
        }
        return sum;
    }
}
