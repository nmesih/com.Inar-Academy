package Chapters.chapter_09.Exercises.Exercise_02;

public class Stock {
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;

    Stock(String newSymbol, String newName){
        symbol = newSymbol;
        name = newName;
    }

    public double getChangePercent() {
        double changePercent = ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
        return changePercent;
    }
}
