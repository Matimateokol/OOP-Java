package com.company;
import java.util.*;
import java.util.stream.IntStream;

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
        int index = IntStream.range(0, Rejestr_zlecen.zlecenia.size())
                .filter(i -> Objects.equals(Rejestr_zlecen.zlecenia.get(i).id_zlecenia, id_zlecenia))
                .findFirst()
                .orElse(-1);
        Rejestr_zlecen.zlecenia.get(index).status = status;
    }
}
