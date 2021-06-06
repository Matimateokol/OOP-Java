package com.company;

class Zlecenie {
    protected String data_utworzenia;
    protected int id_zlecenia;
    protected String status;

    Zlecenie (int id_zlecenia, String data_utworzenia, String status) {
        this.id_zlecenia = id_zlecenia;
        this.data_utworzenia = data_utworzenia;
        this.status = status;
    }
}
