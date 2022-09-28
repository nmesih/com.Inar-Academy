package Chapters.chapter_06;

public class C06E12 {
    public static void main(String[] args) {
        System.out.println("Characters from '1' to 'Z' : ");
    printChars('1', 'Z' ,10);
    }
    public static void printChars(char ch1, char ch2, int  numberPerLine){
        int count = 0;
        for (int i = 49; i <= 90 ; i++) {
            System.out.print((char) i + " ");
            count++;
            if(count == 10){
                System.out.println();
                count = 0;
            }
        }
    }
}
