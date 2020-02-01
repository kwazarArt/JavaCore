package main.java.com.kwazarArt.javacore.Game;

import java.util.Random;

public class PlayerComputer implements Player {
    private String name;

    public PlayerComputer() {
        this.name = "ComputerName";
    }

    public String getName() {
        return name;
    }

    @Override
    public Variant choiceVariant() {
        Random rand = new Random();
        int x = rand.nextInt(3);
        switch (x) {
            case 0:
                System.out.println(this.getName() + " выбрал КАМЕНЬ");
                return Variant.STONE;
            case 1:
                System.out.println(this.getName() + " выбрал НОЖНИЦЫ");
                return Variant.SCISSORS;
            case 2:
                System.out.println(this.getName() + " выбрал БУМАГУ");
                return Variant.PAPER;
            default: return null;
        }
    }

}
