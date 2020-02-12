package com.kwazarArt.javacore.chapter18.collectionsStorage;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        CollStorage cs = new CollStorage();
        System.out.println("Creating storage...");

        int coursor;
        do {
            System.out.println("Please, select option:");
            System.out.println("1 - add");
            System.out.println("2 - delete");
            System.out.println("3 - search by number");
            System.out.println("4 - search by index");
            System.out.println("5 - search min element");
            System.out.println("6 - search max element");
            System.out.println("7 - search avarage");
            System.out.println("0 - exit");
            coursor = cs.input();
            if (coursor == 0) break;
            if (coursor < 1 || coursor > 7)
                System.out.println("Select again");
            else
                cs.selectAction(coursor);
        } while (coursor >= 1 || coursor <= 7);

    }
}
