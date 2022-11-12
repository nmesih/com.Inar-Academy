package Chapters.chapter_10.Exercises.Exercise_26;

public class Exercise_26 {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println(
                    "Usage: java Calculator operand1 operator operand2");
            System.exit(0);
        }
        args[0] = args[0].trim();
        args[2] = args[2].trim();

        int result = 0;

        switch (args[1].charAt(0)) {
            case '+':
                result = Integer.parseInt(args[0]) +
                        Integer.parseInt(args[2]);
                break;
            case '-':
                result = Integer.parseInt(args[0]) -
                        Integer.parseInt(args[2]);
                break;
            case '.':
                result = Integer.parseInt(args[0]) *
                        Integer.parseInt(args[2]);
                break;
            case '/':
                result = Integer.parseInt(args[0]) /
                        Integer.parseInt(args[2]);
        }

        // Display result
        System.out.println(args[0] + ' ' + args[1] + ' ' + args[2]
                + " = " + result);
    }

}
