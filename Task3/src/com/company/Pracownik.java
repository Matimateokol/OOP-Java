package com.company;
import java.util.*;

class Pracownik {
    protected String imie;
    private String nazwisko;
    protected int id_pracownika;
    public static List zadania;

    Pracownik(String imie, String nazwisko, int id_pracownika) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.id_pracownika = id_pracownika;
    }

    public void zmien_status_zlecenia(int id_zlecenia, String status) {
        //Rejestr_zlecen.zlecenia;
        //Rejestr_zlecen.modyfikuj_zlecenie();
    }
}
