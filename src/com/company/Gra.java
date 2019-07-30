package com.company;

public class Gra {
    // i to wiersz
    // j to kolumna

    public static void start() {
        Plansza plansza = new Plansza(3, 3);
        Komunikat komunikat = new Komunikat();
        Scan scan = new Scan();
        Logika logika = new Logika(komunikat, plansza, scan);

        plansza.setDlugosc(3);          // !!!!!! WAŻNE
        plansza.setSzerokosc(3);        // !!!!!!
        plansza.setWielkoscPlanszy(3, 3);    // !!!!!
        logika.rozgrywka();

    }

    public static void main(String[] args) {
        start();
        // sbkall
    }
}
