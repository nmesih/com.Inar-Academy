package Chapters.chapters_08;

public class C08E04 {
    public static void main(String[] args) {
        int[][] m = {
                {2, 4, 3, 4, 5, 8, 8},
                {7, 3, 4, 3, 3, 4, 4},
                {3, 3, 4, 3, 3, 2, 2},
                {9, 3, 4, 7, 3, 4, 1},
                {3, 5, 4, 3, 6, 3, 8},
                {3, 4, 4, 6, 3, 4, 4},
                {3, 7, 4, 8, 3, 8, 4},
                {6, 3, 5, 9, 2, 7, 9}};

        int[][] result = new int[m.length][2];

        for (int row = 0; row < m.length; row++) {
            int totalOfThisRow = 0;
            for (int col = 0; col < m[row].length; col++) {
                totalOfThisRow += m[row][col];
            }
            result[row][0] = row;
            result[row][1] = totalOfThisRow;
        }
        sort(result);

        for (int j = 0; j < result.length; j++) {
            System.out.println("Employee " + result[j][0] + " worked for " + result[j][1] + " hours.");
        }
    }

    public static void sort(int[][] result) {
        for (int i = 0; i < result.length - 1; i++) {

            int currentMin = result[i][1];
            int currentMinIndex = i;

            for (int j = i + 1; j < result.length; j++) {
                if (currentMin > result[j][1]) {
                    currentMin = result[j][1];
                    currentMinIndex = j;
                }
            }

            if (currentMinIndex != i) {
                result[currentMinIndex][1] = result[i][1];
                result[i][1] = currentMin;
                result[currentMinIndex][0] = result[i][0];
                result[i][0] = currentMinIndex;

            }
        }
    }
}

