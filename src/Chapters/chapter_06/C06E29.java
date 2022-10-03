package Chapters.chapter_06;

public class C06E29 {
    public static void main(String[] args) {
        System.out.println("Twin primes are: ");
        int number = 2;
        while (number <= 1000) {
            if (isPrime(number) && isPrime(twinPrime(number))) {
                System.out.println("(" + number + ", " +twinPrime(number) + ")");
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

    public static int twinPrime(int number) {
        int twinPrime = number + 2;
        return twinPrime;
    }
}