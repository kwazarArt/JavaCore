package main.java.com.kwazarArt.javacore.Game;

import java.io.IOException;

public class PlayerPerson implements Player {
    private String name;

    public PlayerPerson() throws IOException {
        System.out.print("Input player name, please: ");
        this.name = input();
        System.out.println();
    }

    @Override
    public Variant choiceVariant() throws IOException {
        char choice;
        do {
            System.out.println("Выберите свой вариaнт:");
            System.out.println("\t1. Камень");
            System.out.println("\t2. Ножницы");
            System.out.println("\t3. Бумага");
            System.out.println("Выберите нужный пункт:");
            choice = (char) System.in.read();
        } while (choice < '1' || choice > '3');

        switch (choice) {
            case '1':
                System.out.println(this.getName() + " выбрал КАМЕНЬ");
                return Variant.STONE;
            case '2':
                System.out.println(this.getName() + " выбрал НОЖНИЦЫ");
                return Variant.SCISSORS;
            case '3':
                System.out.println(this.getName() + " выбрал БУМАГУ");
                return Variant.PAPER;
            default:
                return null;
        }
    }

    public String getName () {
        return name;
    }
}
