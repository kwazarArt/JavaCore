package main.java.com.kwazarArt.javacore.Chapter02;

public class IfSample {
    public static void main(String[] args) {
        int x,y;

        x = 10;
        y = 20;
        if (x < y) System.out.println("x меньше y");

        x = x * 2;
        if (x == y) System.out.println("теперь х равно у");

        x = x * 2;
        if (x > y) System.out.println("теперь х больше у");

        if (x == y) System.out.println("вы не увидите это сообщение");
    }
}
