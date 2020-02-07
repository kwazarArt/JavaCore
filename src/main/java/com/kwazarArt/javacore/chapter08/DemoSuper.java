package main.java.com.kwazarArt.javacore.chapter08;

public class DemoSuper {
    public static void main(String[] args) {
        BoxWeight mybox1 = new BoxWeight(10,20, 15, 34.3);
        BoxWeight mybox2 = new BoxWeight(2,3,4, 0.076);
        BoxWeight mybox3 = new BoxWeight();
        BoxWeight myCube = new BoxWeight(3,2);
        BoxWeight myClone = new BoxWeight(mybox1);
        double vol;

        vol = mybox1.volume();
        System.out.println("Объем mybox1 равен " + vol);
        System.out.println("Вес mybox1  равен " + mybox1.weight);
        System.out.println();

        vol = mybox2.volume();
        System.out.println("Объем mybox2 равен " + vol);
        System.out.println("Вес mybox2  равен " + mybox2.weight);
        System.out.println();

        vol = mybox3.volume();
        System.out.println("Объем mybox3 равен " + vol);
        System.out.println("Вес mybox3  равен " + mybox3.weight);
        System.out.println();

        vol = myCube.volume();
        System.out.println("Объем myCube равен " + vol);
        System.out.println("Вес myCube  равен " + myCube.weight);
        System.out.println();

        vol = myClone.volume();
        System.out.println("Объем myClone равен " + vol);
        System.out.println("Вес myClone  равен " + myClone.weight);
        System.out.println();
    }
}
