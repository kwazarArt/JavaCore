package main.java.com.kwazarArt.javacore.Chapter09;

public class AnotherClient implements Callback {
    @Override
    public void callback(int p) {
        System.out.println("Еще один вариант метода callback()");
        System.out.println("p в квадрате равно " + (p*p));
    }
}
