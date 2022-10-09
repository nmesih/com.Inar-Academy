package Chapters.chapter_07;

public class Checkpoint_25 {
    public static void main(String[] args) {
        double[] list = {3.4, 5, 3, 3.5, 2.2, 1.9, 2};
        selectionSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }

    public static void selectionSort(double[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            double currentMax = list[i];
            int currentMaxIndex = i;
            for (int j = i + 1; j < list.length; j++) {
                if (currentMax < list[j]) {
                    currentMax = list[j];
                    currentMaxIndex = j;
                }
            }
            if (currentMaxIndex != i) {
                list[currentMaxIndex] = list[i];
                list[i] = currentMax;
            }
        }
    }
    }

