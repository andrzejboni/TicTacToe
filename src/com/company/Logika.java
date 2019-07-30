package com.company;


public class Logika {

    private Komunikat komunikat;
    private Plansza plansza;
    private Scan scan;

    public Logika(Komunikat komunikat, Plansza plansza, Scan scan) {
        this.komunikat = komunikat;
        this.plansza = plansza;
        this.scan = scan;
    }

    public void rozgrywka() {

        komunikat.przywitanie();
        plansza.wyczyscPlansze();

        while (true) { // główna pętla
            plansza.wypiszPlansze();

            if (plansza.kolko) {
                postawZnak(plansza.getZnak1());
            }

            if (plansza.krzyzyk) {
                postawZnak(plansza.getZnak2());
            }


            plansza.setCounter(plansza.getCounter() + 1);


            if (plansza.czyJestWygrany('X')) {
                komunikat.wygrana('X');
                plansza.wypiszPlansze();
                break;
            }
            if (plansza.czyJestWygrany('O')) {
                komunikat.wygrana('O');
                plansza.wypiszPlansze();
                break;
            }
            if (plansza.getCounter() == plansza.getWielkoscPlanszy()) {    // Sprawdzam czy nie ma remisu, lub ktoś nie wygrał.
                komunikat.remis();
                plansza.wypiszPlansze();
                break;
            }

            if (plansza.isKrzyzyk()) {
                plansza.setKrzyzyk(false);
                plansza.setKolko(true);
            } else {
                plansza.setKrzyzyk(true);
                plansza.setKolko(false);
            }


        }
    }

    public void postawZnak(char znak) {

        komunikat.podajWsporzedne();
        plansza.setI(Scan.getScanner());
        plansza.setJ(Scan.getScanner());

        while (!plansza.czyMoznaPostawicZnak(plansza.getI(), plansza.getJ())) {
            komunikat.nieMoznaPostawicZNaku();
            komunikat.podajWsporzedne();
            plansza.setI(Scan.getScanner());
            plansza.setJ(Scan.getScanner());
        }

        plansza.setZnak(plansza.getI(), plansza.getJ(), znak);

    }
}

