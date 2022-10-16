package Chapters.chapter_07;

public class C07E29{
    public static void main(String[] args) {
        int[] deck = new int[52];
        System.out.print("Number of picks: ");
        numberOfPicks(deck);
    }
    public static void numberOfPicks(int[] deck){
        int sum = 0;
        int numberOfPick = 0;
        while (sum != 24) {
            sum = pickCard() + pickCard() + pickCard() +pickCard();
            numberOfPick++;
    }
        System.out.println(numberOfPick);
}

    public static int pickCard() {
        int card = (int) (Math.random() * 52);
        return card;
    }
    }
