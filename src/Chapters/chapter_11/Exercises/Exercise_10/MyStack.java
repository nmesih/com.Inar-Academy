package Chapters.chapter_11.Exercises.Exercise_10;

import java.util.ArrayList;

public class MyStack extends ArrayList<Object> {

    public MyStack(){

    }

    public void push(Object o){
        super.add(o);
    }

    public Object pop(){
        return super.remove(super.size() - 1);
    }

    public Object peek() {
        return super.get(getSize() - 1);
    }

    public boolean isEmpty() {
        return super.isEmpty();
    }

    public int getSize() {
        return super.size();
    }

    @Override
    public String toString() {
        return "stack: " + super.toString();
    }
}

