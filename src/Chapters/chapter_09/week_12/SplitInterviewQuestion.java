package Chapters.chapter_09.week_12;

public class SplitInterviewQuestion {
    public static void main(String[] args) {
        findJavaInCv();
    }
    public static void findJavaInCv(){
        String cv = "I'm nurullah. I have been working Java for three months. " +
                "I'm improving day by day in Java. I hope to finish Java in three weeks.";

        String[] arr = cv.split("Java");
        display(arr);
        int count = arr.length-1;
        System.out.println(count);
    }

    private static void display(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
