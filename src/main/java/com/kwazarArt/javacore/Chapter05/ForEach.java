package main.java.com.kwazarArt.javacore.Chapter05;

public class ForEach {
    public static void main(String[] args) {
        int num[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for (int x : num) {
            System.out.println("x = " + x);
            sum += x;
        }

        System.out.println("sum = " + sum);
    }
}
