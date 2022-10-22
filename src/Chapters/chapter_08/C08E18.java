package Chapters.chapters_08;

public class C08E18 {
    public static void main(String[] args) {
        int[][] m =  {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};
        System.out.println("Before the shuffle: ");
        print(m);
        shuffle(m);
        System.out.println("\nAfter the shuffle: ");
        print(m);

    }
    public static void shuffle(int[][] m){

        for (int i = 0; i < m.length; i++) {
                int i1 = (int) (Math.random() * m.length);
                // Swap matrix[i][j] with matrix[i1][j1]
                int temp = m[i][0];
                m[i][0] = m[i1][0];
                m[i1][0] = temp;
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
