package Chapters.chapter_13.Exercises.E08;


public class E_08 {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(14);
        stack.push("Haziran");
        stack.push(1925);
        System.out.println(stack);
        MyStack stack2 = (MyStack) stack.clone();
        System.out.println("\nThe cloned stack:");
        System.out.println(stack2);

    }
}
