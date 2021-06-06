package com.company;

public class Main {

    public static void main(String[] args) {
	    Kwadrat kwadrat = new Kwadrat(5);
	    Kolo kolo = new Kolo(5);

	    System.out.println("Powierzchnia kształtu to: " + kwadrat.obliczPowierzchnie());
	    System.out.println("Powierzchnia kształtu to: " + kolo.obliczPowierzchnie());
    }
}
