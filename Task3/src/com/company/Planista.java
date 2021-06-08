package com.company;
import java.util.*;

class Planista {
    protected String imie;
    private String nazwisko;
    protected int id_planista;

    public static Map<String,String> zadania = new HashMap<>();

    Planista(String imie, String nazwisko, int id_planista){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.id_planista = id_planista;
    }

    public void podejrzyj_rejestr_zlecen() {
        Rejestr_zlecen.zlecenia.forEach( (n) -> { System.out.println("ID: " + n.id_zlecenia + " Data utworzenia: " + n.data_utworzenia + " Status: " + n.status); } );
    }

    public void pokaz_zadania() {
        //to be implemented://
        //zadania.keySet().stream()
        //                .forEach(System.out::println);
    }

    public void przydziel_zlecenia_pracownikowi() {
        //to be implemented://
        //zadania.put() <------ <String,String>
        //Pracownik.zadania.add("Task1")
    }
}
