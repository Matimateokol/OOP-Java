package com.company;

public class TestApp {

    public static void main(String[] args) {
	Recepcjonista recepcjonista1 = new Recepcjonista(321234543,"Arkadiusz","Pawlak");
	Pracownik pracownik1 = new Pracownik("Paweł","Domagała",456);
	Planista planista1 = new Planista("Marta","Kowalska",123);

	planista1.podejrzyj_rejestr_zlecen();
	Rejestr_zlecen.modyfikuj_zlecenie(0,1,"24-03-2021","wykonano");
    }
}
