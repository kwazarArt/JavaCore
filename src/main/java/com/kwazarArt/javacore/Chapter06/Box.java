package main.java.com.kwazarArt.javacore.Chapter06;

public class Box {
    double width;
    double height;
    double depth;

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    Box() {
        System.out.println("Конструирование объекта Box");
        this.width = 10;
        this.height = 10;
        this.depth = 10;
    }

    double volume() {
        return width * height * depth;
    }

    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}
