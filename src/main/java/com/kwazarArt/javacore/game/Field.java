package com.kwazarArt.javacore.game;

class Field {
    Variant firstPlayerStep;
    Variant secondPlayerStep;

    public Variant getFirstPlayerStep() {
        return firstPlayerStep;
    }

    public Variant getSecondPlayerStep() {
        return secondPlayerStep;
    }

    public void setFirstPlayerStep(Variant firstPlayerStep) {
        this.firstPlayerStep = firstPlayerStep;
    }

    public void setSecondPlayerStep(Variant secondPlayerStep) {
        this.secondPlayerStep = secondPlayerStep;
    }
}
