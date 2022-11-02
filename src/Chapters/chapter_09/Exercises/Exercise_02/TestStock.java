package Chapters.chapter_09.Exercises.Exercise_02;

public class TestStock {
    public static void main(String[] args) {
        Stock oracle = new Stock("ORCL", "Oracle Corporation");

        oracle.previousClosingPrice = 34.5;
        oracle.currentPrice = 34.35;

        System.out.println("Symbol: " + oracle.symbol + "\nName  : " + oracle.name +
                "\nPrice-change percentage: " + oracle.getChangePercent());
    }
}
