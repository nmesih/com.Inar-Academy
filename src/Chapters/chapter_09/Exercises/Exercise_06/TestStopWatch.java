package Chapters.chapter_09.Exercises.Exercise_06;

public class TestStopWatch {
    public static void main(String[] args) {

        int[] arr = new int[100000];
        StopWatch timer = new StopWatch();

        timer.start();
        for (int i = 0; i < 99999; i++) {
            arr[i] = randomNumbers();
            arr[i+1] = randomNumbers();
            if(arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        timer.stop();
        printArray(arr);
        System.out.println("\nElapsed time: " + timer.getElapsedTime() + " milliseconds");
    }

    public static int randomNumbers() {
        int number;
        number = (int) (Math.random() * 100_000);
        return number;
    }
    private static void printArray(int[] arr) {
        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%8d", arr[i]);
            if(count % 10 == 0){
                System.out.println();
            }
            count++;
        }

    }
}
