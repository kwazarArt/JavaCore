package main.java.com.kwazarArt.javacore.Game;

public class Player {
     private String name;
     private PlayerType type;

    public Player(String name) {
        this.name = name;
        this.type = PlayerType.PERSON;
    }

    public Player() {
        this.name = "Computer";
        this.type = PlayerType.COMPUTER;
    }

    public String getName() {
        return name;
    }

    public PlayerType getType() {
        return type;
    }
}
