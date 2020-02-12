package com.kwazarArt.javacore.chapter05;

public class ForEach3 {
    public static void main(String[] args) {
        int num[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int x : num) {
            System.out.print("x = " + x);
            x = x * 10;
        }

        System.out.println();

        for (int x : num) {
            System.out.print("x = " + x);
        }
        System.out.println();
    }
}
