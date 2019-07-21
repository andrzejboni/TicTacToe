package com.company;


public class Logika {

    Komunikat komunikat;
    Plansza plansza;
    Scan scan;

    public Logika(Komunikat komunikat, Plansza plansza, Scan scan) {
        this.komunikat = komunikat;
        this.plansza = plansza;
        this.scan = scan;
    }

    public void rozgrywka() {

        for (int w = 0; w < plansza.getWielkoscPlanszy(); w++) {

            if (w == plansza.getWielkoscPlanszy()) {    // Sprawdzam czy nie ma remisu, lub ktoś nie wygrał.
                komunikat.remis();
                break;
            }
            if (plansza.czyJestWygrany('X')) {
                komunikat.przegrana('O');
                komunikat.wygrana('X');
                break;
            }
            if (plansza.czyJestWygrany('O')) {
                komunikat.przegrana('X');
                komunikat.wygrana('O');
                break;
            }

            Scan.getScanner().nextInt();

            if (plansza.kolko) {

                komunikat.podajWsporzedne();
                plansza.setI(Scan.getScanner().nextInt());
                plansza.setJ(Scan.getScanner().nextInt());

                if (plansza.czyMoznaPostawicZnak(plansza.getI(), plansza.getJ())) {
                    plansza.setZnak(plansza.getI(), plansza.getJ(), plansza.znak1);
                } else {
                    komunikat.nieMoznaPostawicZNaku();
                }
            }

            if (plansza.krzyzyk) {

                komunikat.podajWsporzedne();
                plansza.setI(Scan.getScanner().nextInt());
                plansza.setJ(Scan.getScanner().nextInt());

                if (plansza.czyMoznaPostawicZnak(plansza.getI(), plansza.getJ())) {
                    plansza.setZnak(plansza.getI(), plansza.getJ(), plansza.znak2);
                } else {
                    komunikat.nieMoznaPostawicZNaku();
                }
            }


            plansza.wypiszPlansze();

            if (plansza.isKrzyzyk()) {
                plansza.setKrzyzyk(false);
                plansza.setKolko(true);
            } else {
                plansza.setKrzyzyk(true);
                plansza.setKolko(false);
            }

        }
    }

}
