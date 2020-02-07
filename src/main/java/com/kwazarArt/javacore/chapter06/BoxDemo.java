package main.java.com.kwazarArt.javacore.chapter06;

public class BoxDemo {
    public static void main(String[] args) {
        Box mybox = new Box();
        double vol;
        mybox.depth = 15;
        mybox.height = 20;
        mybox.width = 10;

        vol = mybox.depth * mybox.width * mybox.height;
        System.out.println("Объем равен " + vol);
    }
}
