package main.java.com.kwazarArt.javacore.Chapter09;

public class B implements A.NestedIF {
    @Override
    public boolean isNonNegative(int x) {
        return x < 0 ? false : true;
    }
}
