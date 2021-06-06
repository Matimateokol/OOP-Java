package com.company;

public class Kwadrat extends Ksztalt {
    private double dlugoscBoku;

    @Override
    public double obliczPowierzchnie() {
        return dlugoscBoku * dlugoscBoku;
    }

    @Override
    public double obliczObwod() {
        return dlugoscBoku * 4;
    }

    Kwadrat(double dlugoscBoku) {
        this.dlugoscBoku = dlugoscBoku;
    }
}
