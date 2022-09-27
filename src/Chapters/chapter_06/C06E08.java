package Chapters.chapter_06;

public class C06E08 {
    public static void main(String[] args) {
        double celcius = 40;
        double fahrenheit = 104;
        System.out.printf("%-14s%-16s%-8s%-14s%-14s", "Celcius", "Fahrenheit", "|", "Fahrenheit", "Celcius");
        System.out.println("\n------------------------------------------------------------");

            for (double a = 40, b = 120; a > 30; a--, b -= 10) {
                System.out.printf("%-14.1f%-16.1f%-8s%-14.1f%-14.2f", a, celsiusToFahrenheit(a), "|" , b , fahrenheitToCelsius(b));
                System.out.println();
            }

        }

    public static double celsiusToFahrenheit(double celsius){
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }
   public static double fahrenheitToCelsius(double fahrenheit){
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
   }
}
