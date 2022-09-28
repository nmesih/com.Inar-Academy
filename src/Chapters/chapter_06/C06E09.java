package Chapters.chapter_06;

public class C06E09 {
    public static void main(String[] args) {

        System.out.printf("%-12s%-12s%-7s%-12s%-12s", "Feet", "Meters", "|", "Meters", "Feet");
        System.out.println("\n------------------------------------------------------------");

        for (double a = 1, b = 20; a <= 10; a++, b += 5) {
            System.out.printf("%-12.1f%-12.3f%-7s%-12.1f%-12.3f", a, footToMeter(a), "|", b, meterToFoot(b));
            System.out.println();
        }

    }

    public static double footToMeter(double foot) {
        double meter = 0.305 * foot;
        return meter;
    }

    public static double meterToFoot(double meter) {
        double foot = 3.279 * meter;
        return foot;
    }
}

