package Chapters.chapters_08;

/*
Student 0 is correct count is 7
Student 1 is correct count is 6
Student 2 is correct count is 5
Student 3 is correct count is 4
Student 4 is correct count is 8
Student 5 is correct count is 7
Student 6 is correct count is 7
Student 7 is correct count is 7
 */

public class C08E03 {
    public static void main(String[] args) {
        char[][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        int[][] result = new int[answers.length][2];
        for (int i = 0; i < answers.length; i++) {
            int correctCount = 0;
            for (int j = 0; j < answers[i].length; j++) {
                if (keys[j] == answers[i][j]) {
                    correctCount++;
                }
            }
            result[i][0] = i;
            result[i][1] = correctCount;
        }
        sort(result);

        for (int j = 0; j < result.length; j++) {
            System.out.println("Student " + result[j][0] + " is correct count is " + result[j][1]);
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
