package main.java.com.kwazarArt.javacore.Chapter09;

public class TestIface {
    public static void main(String[] args) {
        Callback c = new Client();
        c.callback(42);
    }
}
