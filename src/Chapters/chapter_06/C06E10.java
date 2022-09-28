package Chapters.chapter_06;

public class C06E10 {
    public static void main(String[] args) {
        System.out.println("Prime numbers less than 10000 are: ");
        printPrimeNumbers(5);
    }

    public static void printPrimeNumbers(int numberOfPrimes) {
        final int NUMBER_OF_PRIMES_PER_LINE = 10;
        int count = 0;
        int number = 2;
        for (number = 2; number < 10000; number++) {
            if (Listing_07_PrimeNumberMethod.isPrime(number)) {
                count++;
                if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
                    System.out.printf("%7d\n", number);
                } else
                    System.out.printf("%7d", number);
            }
        }
    }


}

