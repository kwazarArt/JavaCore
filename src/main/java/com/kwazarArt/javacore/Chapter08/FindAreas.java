package main.java.com.kwazarArt.javacore.Chapter08;

public class FindAreas {
    public static void main(String[] args) {
        //Figure f = new Figure(10,10);
        Rectangle r = new Rectangle(9,5);
        Triangle t = new Triangle(10,8);
        Figure figRef;

        figRef = r;
        System.out.println("Площадь равна " + figRef.area());

        figRef = t;
        System.out.println("Площадь равна " + figRef.area());

        //figRef = f;
        //System.out.println("Площадь равна " + figRef.area());
    }
}
