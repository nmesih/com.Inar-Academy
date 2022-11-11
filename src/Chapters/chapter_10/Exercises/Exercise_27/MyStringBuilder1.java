package Chapters.chapter_10.Exercises.Exercise_27;

public class MyStringBuilder1 {
    //public MyStringBuilder1(String s);
    //public MyStringBuilder1 append(MyStringBuilder1 s);
    //public MyStringBuilder1 append(int i);
    //public int length();
    //public char charAt(int index);
    //public MyStringBuilder1 toLowerCase();
    //public MyStringBuilder1 substring(int begin, int end);
    //public String toString();
    private String s;

    public MyStringBuilder1(String s) {
        this.s = s;
    }

    public MyStringBuilder1 append(MyStringBuilder1 s) {
        this.s = this.s + s.toString();
        return new MyStringBuilder1(this.s);
    }

    public MyStringBuilder1 append(int i) {
        this.s = this.s + i;
        return new MyStringBuilder1(this.s);
    }

    public int length() {
        return this.s.length();
    }

    public char charAt(int i) {
        return this.s.charAt(i);
    }

    public MyStringBuilder1 toLowerCase(){
        String s1 = "";
        for (int i = 0; i < this.s.length(); i++) {
            if(this.s.charAt(i) >= 'A' && this.s.charAt(i) <= 'Z') {
                char ch = (char)(s.charAt(i) - ('A' - 'a'));
                s1 += ch;
            } else {
                s1 += this.s.charAt(i);
            }
        }
        this.s = s1;
        return this;
    }

    public MyStringBuilder1 substring(int begin, int end){
        this.s = this.s.substring(begin, end);
        return new MyStringBuilder1(this.s);
    }

    public String toString(){
        String output = "";
        for (int i = 0; i < length(); i++) {
             output += charAt(i);
        }
        return output;
    }
}
