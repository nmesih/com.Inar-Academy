package Chapters.chapter_06;

public class C06E38 {
    public static void main(String[] args) {
        final int NUMBER_OF_CHARS = 100;
        int count = 0;
        System.out.println("Random upper case letters: ");
        for (int i = 0; i < NUMBER_OF_CHARS; i++) {
            System.out.print(getRandomUpperCaseLetter() + " ");
            count++;
            if (count % 10 == 0) {
                System.out.println();
            }
        }
        System.out.println("Random digit characters");
        count = 0;
        for (int i = 0; i < NUMBER_OF_CHARS; i++) {
            System.out.print(getRandomDigitCharacter() + " ");
            count++;
            if (count % 10 == 0) {
                System.out.println();
            }
        }
    }
    public static char getRandomUpperCaseLetter() {
        return getRandomCharacter('A', 'Z');
    }

    public static char getRandomDigitCharacter() {
        return getRandomCharacter('0', '9');
    }

    public static char getRandomCharacter(char ch1, char ch2) {
        return (char) (ch1 + Math.random() * (ch2 - ch1 + 1));
    }

}
