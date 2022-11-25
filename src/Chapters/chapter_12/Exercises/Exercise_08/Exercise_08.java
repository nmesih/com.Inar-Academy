package Chapters.chapter_12.Exercises.Exercise_08;

import java.util.Scanner;

public class Exercise_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueInput = true;

        do {
            try {
                System.out.print("Enter a hex number: ");
                String hex = input.nextLine();
                System.out.println("The decimal value for hex number "
                        + hex + " is " + hexToDecimal(hex.toUpperCase()));
                continueInput = false;
            } catch (HexFormatException ex) {
                System.out.println(ex);
            }
        } while (continueInput) ;
    }

    public static int hexToDecimal(String hex) throws HexFormatException {
        for (int i = 0; i < hex.length(); i++) {
            char c = hex.charAt(i);
            if (!(c >= 'A' && c <= 'F') && !(c >= '0' && c <= '9')) {
                throw new HexFormatException("Illegal hex value!");
            }
        }
        int decimalValue = 0;
        for (int i = 0; i < hex.length(); i++) {
            char hexChar = hex.charAt(i);
            decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
        }
        return decimalValue;
    }

    public static int hexCharToDecimal(char ch) {
        if (ch >= 'A' && ch <= 'F')
            return 10 + ch - 'A';
        else
            return ch - '0';
    }
}
