package com.company;

class Recepcjonista {
    protected int nip;
    protected String imie;
    private String nazwisko;

    Recepcjonista (int nip, String imie, String nazwisko) {
        this.nip = nip;
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public void dodaj_zlecenie (int id_zlecenia, String data_utworzenia, String status ) {
        Rejestr_zlecen.zlecenia.add(new Zlecenie(id_zlecenia, data_utworzenia, status));
    };
}
