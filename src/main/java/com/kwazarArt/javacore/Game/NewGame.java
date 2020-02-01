package main.java.com.kwazarArt.javacore.Game;

import java.io.IOException;

class NewGame {
    private Player player1;
    private Player player2;

    NewGame() throws IOException {
        Field field = new Field();
        this.player1 = field.getPlayer1();
        this.player2 = field.getPlayer2();
    }

    void newGame() throws IOException {
        GameLogic logic = new GameLogic(this);
    }

    Player getPlayer1() {
        return player1;
    }

    Player getPlayer2() {
        return player2;
    }


}
