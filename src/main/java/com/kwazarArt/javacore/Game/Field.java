package main.java.com.kwazarArt.javacore.Game;

class Field {
    Variant variant1;
    Variant variant2;

    public Field(Variant variant1, Variant variant2) {
        this.variant1 = variant1;
        this.variant2 = variant2;
    }

    public Variant getVariant1() {
        return variant1;
    }


    public Variant getVariant2() {
        return variant2;
    }

}
