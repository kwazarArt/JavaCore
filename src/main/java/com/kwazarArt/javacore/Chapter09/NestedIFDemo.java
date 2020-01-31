package main.java.com.kwazarArt.javacore.Chapter09;

public class NestedIFDemo {
    public static void main(String[] args) {
        A.NestedIF nif = new B();

        if (nif.isNonNegative(10)) {
            System.out.println("Число 10 отрицательное");
        }
        if (nif.isNonNegative(-12)) {
            System.out.println("Это не будет выведено");
        }
    }
}
