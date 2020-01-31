package main.java.com.kwazarArt.javacore.Chapter09;

public interface MyIF {
    int getNumber();

    default String getString() {
        return "Объект типа String по умолчанию";
    }
}
