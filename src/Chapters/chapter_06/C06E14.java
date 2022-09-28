package Chapters.chapter_06;

public class C06E14 {
    public static void main(String[] args) {
        //estimate PI
        System.out.printf("%-10s%-10s", "i", "m(i)");
        System.out.println("\n------------------");
        for (int i = 1; i <= 901; i += 100) {
            System.out.printf("%-10d%-10.4f", i, (4 * sumSeries(i)));
            System.out.println();
        }
    }

    public static double sumSeries(int b) {
        double sum = 0;
        for (int i = 1; i <= b; i++) {
            sum += Math.pow(-1, i+1) / ((2 * i) - 1);
        }
        return sum;
    }
    }

