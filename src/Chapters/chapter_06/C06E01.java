package Chapters.chapter_06;

public class C06E01 {
    public static void main(String[] args) {
        System.out.println("First 100 pentagonal numbers is: ");
        getPentagonalNumber(5);
            }
    public static int getPentagonalNumber(int n){
        int pentagonalNumber = 0;
        int count = 0;
        for (n = 1; n <= 100 ; n++) {
            pentagonalNumber = n * ( (3 * n) - 1) / 2;
            System.out.printf("%6d",pentagonalNumber);
            count++;
            if (count == 10){
                System.out.println();
                count=0;
            }
        }
        return count;
    }
}
