package Chapters.chapter_05;

public class Exercise_18 {
    public static void main(String[] args) {
        a();
        b();
        c();
        d();
    }

    public static void a() {
        int n = 6;
        int total = 1;

        for (int i = 1; i <= 6; i++) {

            for (int k = 1; k <= total; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
            total += 1;
        }
    }

    public static void b() {
        int n = 7;
        for (int i = 1; i < 7; i++) {
            for (int k = 1; k <= (n - i); k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }

    }

    public static void c() {
        int n = 6;
        for (int i = 1; i <= 6; i++) {
            for (int k = 1; k <= (n - i); k++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void d(){
        int n = 7;
        int total = 1;

        for (int i = 1; i <= 6; i++) {

            for (int k = 1; k <= total-1; k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= n-1; j++) {
                System.out.print(j + " ");
            }
            n--;
            System.out.println();
            total += 1;
        }
    }
    }

