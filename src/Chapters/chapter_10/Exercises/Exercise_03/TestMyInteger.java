package Chapters.chapter_10.Exercises.Exercise_03;



public class TestMyInteger {
    public static void main(String[] args) {
        MyInteger i = new MyInteger(57);
        System.out.println("Is " + i.getValue() + " even? " + i.isEven());
        System.out.println("Is " + i.getValue() + " odd? " + i.isOdd());
        System.out.println("Is " + i.getValue() + " prime? " + i.isPrime());
        System.out.println("----------");
        MyInteger a = new MyInteger(2);
        System.out.println("Is " + a.getValue() + " even? " + a.isEven());
        System.out.println("Is " + a.getValue() + " odd? " + a.isOdd());
        System.out.println("Is " + a.getValue() + " prime? " + a.isPrime());

        System.out.println("-----------");

        char[] arr1 = {'1', '9', '0', '7'};
        int number1 = MyInteger.parseInt(arr1);
        System.out.println(number1);

        System.out.println("-----------");

        String number = "199855";
        int number2 = MyInteger.parseInt(number);
        System.out.println(number2);

        System.out.println("-----------");

        System.out.println(new MyInteger(23).equals(23));
        System.out.println(new MyInteger(23).equals(i.getValue()));

        System.out.println("-----------");

        System.out.println(MyInteger.isPrime(new MyInteger(61)));
        System.out.println(MyInteger.isPrime(new MyInteger(62)));

        System.out.println(MyInteger.isEven(new MyInteger(61)));
        System.out.println(MyInteger.isEven(new MyInteger(62)));

        System.out.println(MyInteger.isOdd(new MyInteger(61)));
        System.out.println(MyInteger.isOdd(new MyInteger(62)));

    }
}
