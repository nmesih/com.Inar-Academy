package Chapters.chapter_10.Listings.Listing_07_08_StackOfIntegers;

public class TestStackOfIntegers {
    public static void main(String[] args) {
        StackOfIntegers stack = new StackOfIntegers();
        for (int i = 0; i < 10; i++)
            stack.push(i);

            while (!stack.empty())
                System.out.print(stack.pop() + " ");


        }
    }

