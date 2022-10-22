package Chapters.chapters_08;

public class C08E16 {
    public static void main(String[] args) {
        int[][] m = {{4, 2},{1, 7},{4, 5},{1, 2},{1, 1},{4, 1}};
        System.out.println("Before the sort:");
        print(m);
        sort(m);
        System.out.println("\nAfter the sort: ");
        print(m);
    }
    public static void sort(int m[][]) {
        for (int row = 0; row < m.length; row++) {
            int min0 = m[row][0];
            int min1 = m[row][1];
            int index = row;
            for (int i = row + 1; i < m.length; i++) {
                if ((m[i][0] < min0) || ((m[i][1] < min1) && m[i][0] == min0)) {
                    min0 = m[i][0];
                    min1 = m[i][1];
                    index = i;
                }
            }
            if (index != row) {
                m[index][0] = m[row][0];
                m[index][1] = m[row][1];
                m[row][0] = min0;
                m[row][1] = min1;
            }
        }
    }
    public static void print(int[][] m){
        for (int row = 0; row < m.length; row++) {
            for (int col = 0; col < m[row].length; col++) {
                System.out.print(m[row][col] + " ");
            }
            System.out.print("  ");
        }
    }
}
