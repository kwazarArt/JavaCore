package main.java.com.kwazarArt.javacore.Chapter02;

public class BlockTest {
    public static void main(String[] args) {
        int x, y;
        y = 20;

        for (x = 0; x < 10; x++) {
            System.out.println("Значение х равно: " + x);
            System.out.println("Значение y равно: " + y);
            y = y -2;
        }
    }
}
