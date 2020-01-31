package main.java.com.kwazarArt.javacore.Chapter07;

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
            this.width = -1;
            this.height = -1;
            this.depth = -1;
        }

        Box(double len) {
            width = height = depth = len;
        }

        Box(Box ob) {
            this.width = ob.width;
            this.height = ob.height;
            this.depth = ob.depth;
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


