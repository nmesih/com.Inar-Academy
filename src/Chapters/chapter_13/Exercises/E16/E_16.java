package Chapters.chapter_13.Exercises.E16;

public class E_16 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java String");
            System.exit(1);
        }

        String output = args[0];
        String[] arr = args[0].replaceAll(" ", "/").split("/");

        Rational num1 = new Rational(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]));
        Rational num2 = new Rational(Integer.parseInt(arr[3]), Integer.parseInt(arr[4]));

        switch (arr[2]) {
            case "+":
                output += " = " + num1.add(num2);
                break;
            case "-":
                output += " = " + num1.subtract(num2);
                break;
            case "*":
                output += " = " + num1.multiply(num2);
                break;
            case "/":
                output += " = " + num1.divide(num2);
                break;
        }

        System.out.println(output);

    }
}
