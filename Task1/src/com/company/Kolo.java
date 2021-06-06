package com.company;

public class Kolo extends Ksztalt {
    private double dlugoscR;

    @Override
    public double obliczPowierzchnie() {
        return Math.PI * Math.pow(dlugoscR, 2);
    }

    @Override
    public double obliczObwod() {
        return 2 * Math.PI * dlugoscR;
    }

    Kolo(double dlugoscR) {
        this.dlugoscR = dlugoscR;
    }
}
