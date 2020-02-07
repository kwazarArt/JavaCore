package main.java.com.kwazarArt.javacore.game;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

class GameLogic {
    private Player player1;
    private Player player2;
    private Map<Player, Variant> map;
    private Field field;

    GameLogic(String personName) throws IOException {
        this.player1 = new Player(personName);
        this.player2 = new Player();
        map = new HashMap<>();
        field = new Field();
        field.setFirstPlayerStep(choiceVariant(player1));
        field.setSecondPlayerStep(choiceVariant(player2));
        fillMap(player1, player2, field);
    }

    void fillMap(Player player1, Player player2m, Field field) throws IOException {
        map.put(player1, field.getFirstPlayerStep());
        map.put(player2, field.getSecondPlayerStep());
        findWinner(player1, player2);
    }

    private void findWinner(Player player1, Player player2) {
        int x = compareTo(map.get(player1), map.get(player2));
        System.out.print("Результат - ");
        if (x == 1) {
            System.out.println("Победитель " + player1.getName());
        } else if (x == 0) {
            System.out.println("Ничья");
        } else {
            System.out.println("Победитель " + player2.getName());
        }
    }

    int compareTo(Variant var1, Variant var2) {
        if (var1 == Variant.PAPER && var2 == Variant.PAPER) return 0;
        if (var1 == Variant.SCISSORS && var2 == Variant.SCISSORS) return 0;
        if (var1 == Variant.STONE && var2 == Variant.STONE) return 0;
        if (var1 == Variant.SCISSORS && var2 == Variant.PAPER) return 1;
        if (var1 == Variant.SCISSORS && var2 == Variant.STONE) return -1;
        if (var1 == Variant.PAPER && var2 == Variant.SCISSORS) return -1;
        if (var1 == Variant.PAPER && var2 == Variant.STONE) return 1;
        if (var1 == Variant.STONE && var2 == Variant.SCISSORS) return 1;
        if (var1 == Variant.STONE && var2 == Variant.PAPER) return -1;
        return -2;
    }

    public Variant choiceVariant(Player player) throws IOException {
        int x;
        if (player.getType() == PlayerType.PERSON) {
            do {
                System.out.println("Выберите свой вариaнт:");
                System.out.println("\t1. Камень");
                System.out.println("\t2. Ножницы");
                System.out.println("\t3. Бумага");
                System.out.println("Выберите нужный пункт:");
                x = Integer.parseInt(input());
                if (x < 1 || x > 3) System.out.println("Неверная команда.");
            } while (x < 1 || x > 3);
        } else {
            Random rand = new Random();
            x = rand.nextInt(3);
        }
        return printVariant(x, player);
    }

    Variant printVariant(int x, Player player) {
        switch (x) {
            case 0:
                System.out.println(player.getName() + " выбрал КАМЕНЬ");
                return Variant.STONE;
            case 1:
                System.out.println(player.getName() + " выбрал НОЖНИЦЫ");
                return Variant.SCISSORS;
            case 2:
                System.out.println(player.getName() + " выбрал БУМАГУ");
                return Variant.PAPER;
            default:
                return null;
        }
    }

    private String input() throws IOException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        return bufferedReader.readLine();
    }
}
