package main.java.com.kwazarArt.javacore.Chapter06;

public class BoxDemo2 {
    public static void main(String[] args) {
            Box mybox1 = new Box();
            Box mybox2 = new Box();
            double vol;

            mybox1.depth = 15;
            mybox1.height = 20;
            mybox1.width = 10;

            mybox2.depth = 9;
            mybox2.height = 6;
            mybox2.width = 3;

            vol = mybox1.depth * mybox1.width * mybox1.height;
            System.out.println("Объем равен " + vol);

            vol = mybox2.depth * mybox2.width * mybox2.height;
            System.out.println("Объем равен " + vol);
    }
}
