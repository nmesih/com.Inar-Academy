package Chapters.chapter_06;

public class C06E27 {
    public static void main(String[] args) {
        System.out.println("The first 100 emirps are: \n");
        final int NUMBER_OF_PRIMES_PER_LINE = 10;
        int count = 0;
        int number = 2;
        while (count < 100) {
            if (isPrime(number) && isPrime(reverse(number)) && (!isPalindrome(number))){
                count++;
                if (count % NUMBER_OF_PRIMES_PER_LINE == 0){
                    System.out.printf("%7d\n" , number);
                } else
                    System.out.printf("%7d" , number);
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
    public static boolean isPalindrome(int number) { // Reserve number is compared with entered integer.
        int b = reverse(number);
        if (b == number) {
            return true;
        }
        return false;
    }
    public static int reverse(int number) { // An integer is reversed.
        int digit = 0;
        int reverseNumber = 0;
        while (number >= 1) {
            digit = (int) (number % 10);
            reverseNumber = reverseNumber * 10 + digit;
            number = number / 10;
        }

        return reverseNumber;
    }
}
