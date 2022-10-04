package Chapters.chapter_06;

public class C06E30 {
    public static void main(String[] args) {

        System.out.println("Welcome to the Craps! ");
        int a = 0;
        int b = 0;

        while (a + b != 7) {
            a = (int) ((Math.random() * 5) + 1);
            b = (int) ((Math.random() * 5) + 1);
            System.out.println("You rolled " + a + " + " + b + " = " + (a + b));
            if (a + b == 7 || a + b == 11) {
                System.out.println("You win!");
                break;
            }
            if (craps(a, b)) {
                System.out.println("You lose");
                break;
            }
            if (another(a, b)) {
                System.out.println("Point is " + (a + b));
                int sum = a + b;
                while (a + b != 7) {
                    a = (int) ((Math.random() * 5) + 1);
                    b = (int) ((Math.random() * 5) + 1);
                    System.out.println("You rolled " + a + " + " + b + " = " + (a + b));
                    if (a + b == 7) {
                        System.out.println("You lose!");
                        break;
                    }
                    if (a + b == sum) {
                        System.out.println("You win!");
                        break;
                    }
                }
            }
            break;
        }

    }

    public static boolean craps(int a, int b) {
        if (a + b == 2 || a + b == 3 || a + b == 12) {
            return true;
        } else
            return false;
    }

    public static boolean another(int a, int b) {
        int sum = a + b;
        if (sum == 4 || sum == 5 || sum == 6 || sum == 8 || sum == 9 || sum == 10) {
            return true;
        } else
            return false;
    }
}



