package com.company;

public class Gra {
    // i to wiersz
    // j to kolumna

    public static void start() {
        Plansza plansza = new Plansza(3, 3);

        Komunikat komunikat = new Komunikat();
        Scan scan = new Scan();
        Logika logika = new Logika(komunikat, plansza, scan);

        komunikat.przywitanie();
        logika.rozgrywka();
        plansza.wyczyscPlansze();

        plansza.wyczyscPlansze();
        plansza.wypiszPlansze();

//        CzyscPlansza czyscPlansza = new CzyscPlansza();
//        czyscPlansza.wyczyscPlansze(plansza);
//        czyscPlansza.wypiszPlansze(plansza);

    }


    public static void main(String[] args) {
        start();
    }
}
