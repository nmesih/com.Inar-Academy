package Chapters.chapter_12.Exercises.Exercise_01;

public class Exercise_01 {
    public static void main(String[] args) {

        if (args.length != 3) {
            System.out.println(
                    "Usage: java Calculator operand1 operator operand2");

        }
        int result = 0;

        try {

        switch (args[1].charAt(0)) {
            case '+':
                result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
                break;
            case '-':
                result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
                break;
            case '.':
                result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
                break;
            case '/':
                result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]);
        }


    } catch (Exception e) {
            System.out.println("Wrong input: " + args[0] + args[1] + args[2]);
        }
    }
}
