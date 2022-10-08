package Chapters.chapter_07;

public class Checkpoint_13 {
    public static void main(String[] args) {
        int [] source = {3, 4 ,5};
        int [] newArray = new int[3];
        System.arraycopy(source, 0, newArray, 0, source.length);
        System.out.println("newArray is: ");
        for (int i = 0; i < 3; i++) {
            if(i < 2) {
                System.out.print(newArray[i] + ", ");
            } else if(i==2){
                System.out.println(newArray[i]);
            }
        }

    }
}
