package Chapters.chapter_06;

public class C06E28 {
    public static void main(String[] args) {
        System.out.println("Mersenne primes are: \n");
        System.out.printf("%-10s%-10s" , "p" , "2^p - 1");
        System.out.println("\n-------------------------");
        int number = 2;
        while (number <= 31) {
            if (isPrime(number) && isPrime(mersenne(number))) {
                System.out.printf("\n%-10d%-10d", number , mersenne(number));
            }
            number++;
        }
    }

    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }

    public static int mersenne(int number) {
        int mersenne = (int) (Math.pow(2, number) - 1);
        return mersenne;
    }
}
