package com.kwazarArt.javacore.chapter05;

public class BreakLoop3 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 100; j++) {
                if (j == 10) break;
                System.out.print("j = " + j + " ");
            }
            System.out.println();
        }
        System.out.println("Цикл завершен");
    }
}
