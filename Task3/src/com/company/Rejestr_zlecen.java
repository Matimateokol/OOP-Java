package com.company;
import java.util.*;

class Rejestr_zlecen {
    public static ArrayList<Zlecenie> zlecenia;

    public Rejestr_zlecen() {
    }

    public static void modyfikuj_zlecenie(int index, int id_zlecenia, String data_utworzenia, String status) {
        zlecenia.get(index).id_zlecenia = id_zlecenia;
        zlecenia.get(index).data_utworzenia = data_utworzenia;
        zlecenia.get(index).status = status;
    }

    public static void sortuj_zlecenia_FIFO() {
        //zlecenia.sort();
    }

    public static void sortuj_zlecenia_LIFO() {

    }

    public static void usun_zlecenie(int id_zlecenia) {
        zlecenia.removeIf(obj -> obj.id_zlecenia == id_zlecenia);
    }
}
