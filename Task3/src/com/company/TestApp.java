package com.company;

public class TestApp {

    public static void main(String[] args) {

    //Zatrudnianie nowych recepcjonistów, pracowników i planistów:
	Recepcjonista recepcjonista1 = new Recepcjonista(321234543,"Arkadiusz","Pawlak");
	Pracownik pracownik1 = new Pracownik("Paweł","Domagała",456);
	Planista planista1 = new Planista("Marta","Kowalska",123);

	//Dodawanie nowych zleceń do rejestru:
	recepcjonista1.dodaj_zlecenie(2,"22-03-2021","w trakcie");
	recepcjonista1.dodaj_zlecenie(3,"26-03-2021","zgłoszono");
	recepcjonista1.dodaj_zlecenie(4,"28-03-2021","wykonano");

	//Wyswietlanie zlecen w rejestrze:
	planista1.podejrzyj_rejestr_zlecen();

	//Modyfikowanie wybranego zlecenia:
	Rejestr_zlecen.modyfikuj_zlecenie(0,1,"24-03-2021","wykonano");
	planista1.podejrzyj_rejestr_zlecen();

	//Zmienianie statusu wybranego zlecenia:
	pracownik1.zmien_status_zlecenia(4, "TEST");
	planista1.podejrzyj_rejestr_zlecen();

	//Usuwanie zlecenia z rejestru:
	Rejestr_zlecen.usun_zlecenie(3);
	planista1.podejrzyj_rejestr_zlecen();
    }
}
