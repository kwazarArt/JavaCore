package main.java.com.kwazarArt.javacore.Game;

import java.io.IOException;

class GameLogic {
    private Variant personChoice;
    private Variant computerChoice;

    GameLogic(NewGame game) throws IOException {
        this.personChoice = game.getPlayer1().choiceVariant();
        this.computerChoice = game.getPlayer2().choiceVariant();
        findWinner(game);
    }

    private void findWinner(NewGame curGame) {
        int x = compareTo(personChoice, computerChoice);
        System.out.print("Результат - ");
        if (x == 1) {
            System.out.println("Победитель " + curGame.getPlayer1().getName());
        }
        else if (x == 0) {
            System.out.println("Ничья");
        }
        else {
            System.out.println("Победитель " + curGame.getPlayer2().getName());
        }
    }

    private int compareTo(Variant personChoice, Variant computerChoice) {
        if (personChoice == Variant.PAPER && computerChoice == Variant.PAPER) return 0;
        if (personChoice == Variant.SCISSORS && computerChoice == Variant.SCISSORS) return 0;
        if (personChoice == Variant.STONE && computerChoice == Variant.STONE) return 0;
        if (personChoice == Variant.SCISSORS && computerChoice == Variant.PAPER) return 1;
        if (personChoice == Variant.SCISSORS && computerChoice == Variant.STONE) return -1;
        if (personChoice == Variant.PAPER && computerChoice == Variant.SCISSORS) return -1;
        if (personChoice == Variant.PAPER && computerChoice == Variant.STONE) return 1;
        if (personChoice == Variant.STONE && computerChoice == Variant.SCISSORS) return 1;
        if (personChoice == Variant.STONE && computerChoice == Variant.PAPER) return -1;
        return -2;
    }
}
