package Chapters.chapter_06;

public class C06E15 {
    public static void main(String[] args) {
        System.out.printf("%-17s%-17s%-19s%-17s%-17s", "Taxable", "Single", "Married Joint", "Married", "Head of");
        System.out.printf("\n%-17s%-17s%-19s%-17s%-17s", "Income", "      ", "or Qualifying", "Seperate", "a House");
        System.out.printf("\n%44s", "Window(er)");
        System.out.println("\n-----------------------------------------------------------------------------");
        for (int i = 50000; i <= 60000; i += 50) {
            for (int j = 0; j <= 4; j++) {
                System.out.printf("%-18d" , Math.round(computeTax(j, i)));
            }
            System.out.println();
        }

    }

    public static double computeTax(int status, double taxableIncome) {
        if (status == 1 || status == 3) {
            double singleTax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (taxableIncome - 33950) * 0.25;
            return singleTax;
        }
        if (status == 2) {
            double MarriedJointTax = 16700 * 0.10 + (taxableIncome - 16700) * 0.15;
            return MarriedJointTax;
        }
        if (status == 4) {
            double headOfAHouseTax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (taxableIncome - 45500) * 0.25;
            return headOfAHouseTax;
        } else
        return taxableIncome;
    }
}
