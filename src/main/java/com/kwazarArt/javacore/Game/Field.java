package main.java.com.kwazarArt.javacore.Game;

import java.io.IOException;

class Field {
    private Player player1;
    private Player player2;

    Player getPlayer1() {
        return player1;
    }

    Player getPlayer2() {
        return player2;
    }

    Field() throws IOException {
        this.player1 = new PlayerPerson();
        this.player2 = new PlayerComputer();
        greeding(player1, player2);
    }

    private void greeding(Player player1, Player player2) {
        System.out.println("Приветствуем на нашем игровом поле " +
                player1.getName() + " и " + player2.getName());
    }
}
