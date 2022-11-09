package Chapters.chapter_10.Exercises.Exercise_03;

public class MyInteger {
    private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean isEven() {
        if (this.value % 2 == 0) {
            return true;
        } else
            return false;
    }

    public boolean isOdd() {
        if (this.value % 2 != 0) {
            return true;
        } else
            return false;
    }

    public boolean isPrime() {
        if (this.value < 2) {
            return false;
        }
        for (int i = 2; i < this.value; i++) {
            if (this.value % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEven(MyInteger number) {
        return number.isEven();
    }

    public static boolean isOdd(MyInteger number) {
        return (number.isOdd());
    }

    public static boolean isPrime(MyInteger number) {
        return number.isPrime();
    }

    public boolean equals(int number) {
        return value == number;
    }

    public boolean equals(MyInteger number) {
        return value == number.getValue();
    }
    public static int parseInt(char[] array){
        int sum = 0;
        int pow = 0;
        for (int i = array.length -1; i >= 0; i--) {
            sum += (array[i] - '0') * Math.pow(10, pow++);
        }
        return sum;
    }
    public static int parseInt(String number) {
        return parseInt(number.toCharArray());
    }
}
