package com.kwazarArt.javacore.chapter08;

public class ColorBox extends Box {
    int color;

    ColorBox(double w, double h, double d, int c) {
        super(w, h, c);
        color = c;
    }
}
