package com.company;
import java.util.*;

class Planista {
    protected String imie;
    private String nazwisko;
    protected int id_planista;

    public static Map<String,String> zadania;

    Planista(String imie, String nazwisko, int id_planista){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.id_planista = id_planista;
    }

    public void podejrzyj_rejestr_zlecen() {
        System.out.print(Rejestr_zlecen.zlecenia);
    }

    public void pokaz_zadania() {
        //System.out.print(zadania);
    }

    public void przydziel_zlecenia_pracownikowi() {

    }
}
