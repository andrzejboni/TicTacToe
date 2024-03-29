package com.company;

public class Plansza {
    private int dlugosc;
    private int szerokosc;
    private int wielkoscPlanszy;


    boolean krzyzyk = true;
    boolean kolko = false;

    char znak1 = 'O';
    char znak2 = 'X';

    int i;
    int j;


    int counter = 0;

    public void setWielkoscPlanszy(int dlugosc, int szerokosc) {
        this.wielkoscPlanszy = szerokosc * dlugosc;
    }

    int getCounter() {
        return counter;
    }

    void setCounter(int counter) {
        this.counter = counter;
    }

    private char plansza[][];

    public Plansza(int dlugosc, int szerokosc) {
        this.dlugosc = dlugosc;
        this.szerokosc = szerokosc;
        this.plansza = new char[dlugosc][szerokosc];
    }

    public void wyczyscPlansze() {
        for (int i = 0; i < getDlugosc(); i++) {
            for (int j = 0; j < getSzerokosc(); j++) {
                setZnak(i, j, ' ');
            }
        }
    }

    public void setDlugosc(int dlugosc) {
        this.dlugosc = dlugosc;
    }

    public void setSzerokosc(int szerokosc) {
        this.szerokosc = szerokosc;
    }

    public void wypiszPlansze() {

        System.out.print("\n Plansza");
        for (int i = 0; i < getDlugosc(); i++) {
            System.out.print("\n");
            for (int j = 0; j < getSzerokosc(); j++) {
                System.out.print("[" + getPlansza(i, j) + "]");
            }
        }
    }


    public boolean czyMoznaPostawicZnak(int i, int j) {
        if (i > getSzerokosc() || j > getDlugosc()) {
            return false;
        }
        return getPlansza(i, j) == ' ';
    }

    public boolean czyJestWygrany(char znak) {



        if (czyJestWygranyPionowo(znak) || czyJestWygranyPoziomo(znak)
                || czyJestWygranyPrzekatneOdLewyGorny(znak) ||
                czyJestWygranyPrzekatneOdPrawyGorny(znak)) {

            return true;
        }
        return false;
    }


    public boolean czyJestWygranyPionowo(char znak) {

        for (int i = 0; i < getDlugosc(); i++) { // Sprwadzenie po kolumnach
            int licznik = 0;
            for (int j = 0; j < getSzerokosc(); j++) {

                if (getPlansza(i, j) == znak) {
                    licznik++;
                }
                if (licznik == 3) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean czyJestWygranyPoziomo(char znak) {

        for (int i = 0; i < getSzerokosc(); i++) { // Sprwadzenie po wierszach
            int licznik = 0;

            for (int j = 0; j < getDlugosc(); j++) {

                if (getPlansza(j, i) == znak) {
                    licznik++;
                }
                if (licznik == 3) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean czyJestWygranyPrzekatneOdLewyGorny(char znak) {
        int licznik = 0;

        if (getPlansza(0, 0) == znak) {
            licznik++;
        }

        if (getPlansza(1, 1) == znak) {
            licznik++;
        }

        if (getPlansza(2, 2) == znak) {
            licznik++;
        }

        return licznik == 3;
    }

    public boolean czyJestWygranyPrzekatneOdPrawyGorny(char znak) {
        int licznik = 0;


        if (getPlansza(0, 2) == znak) {
            licznik++;
        }

        if (getPlansza(1, 1) == znak) {
            licznik++;
        }

        if (getPlansza(2, 0) == znak) {
            licznik++;
        }

        return licznik == 3;

    }

//
//    public boolean czyJestWygrany(char znak) {
//
//        int licznik = 0;
//
//        for (int i = 0; i < getDlugosc(); i++) { // Sprwadzenie po kolumnach
//            licznik = 0;
//            for (int j = 0; j < getSzerokosc(); j++) {
//
//                if (getPlansza(i, j) == znak) {
//                    licznik++;
//                }
//                if (licznik == 3) {
//                    return true;
//                }
//            }
//        }
//
//        for (int i = 0; i < getSzerokosc(); i++) { // Sprwadzenie po wierszach
//            licznik = 0;
//
//            for (int j = 0; j < getDlugosc(); j++) {
//
//                if (getPlansza(j, i) == znak) {
//                    licznik++;
//                }
//
//                return licznik == 3;
//            }
//        }
//
//        // Sprwadzenie po przekatnych od lewego gornego rogu
//        if (true) {
//            licznik = 0;
//
//            if (getPlansza(0, 0) == znak) {
//                licznik++;
//            }
//
//            if (getPlansza(1, 1) == znak) {
//                licznik++;
//            }
//
//            if (getPlansza(2, 2) == znak) {
//                licznik++;
//            }
//
//            return licznik == 3;
//        }
//        // Sprwadzenie po przekatnych od prawego gornego rogu // i wiersz , j kolumna
//        if (true) {
//            licznik = 0;
//
//            if (getPlansza(0, 2) == znak) {
//                licznik++;
//            }
//
//            if (getPlansza(1, 1) == znak) {
//                licznik++;
//            }
//
//            if (getPlansza(2, 0) == znak) {
//                licznik++;
//            }
//
//            return licznik == 3;
//        }
//        return false;
//
//    }


    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public boolean isKolko() {
        return kolko;
    }

    public void setKolko(boolean kolko) {
        this.kolko = kolko;
    }

    public boolean isKrzyzyk() {
        return krzyzyk;
    }

    public void setKrzyzyk(boolean krzyzyk) {
        this.krzyzyk = krzyzyk;
    }


    public int getDlugosc() {
        return dlugosc;
    }

    public int getWielkoscPlanszy() {
        return wielkoscPlanszy;
    }

    public int getSzerokosc() {
        return szerokosc;
    }

    public char getPlansza(int i, int j) {
        return plansza[i][j];
    }


    public void setZnak(int i, int j, char znak) {
        plansza[i][j] = znak;
    }

    public char getZnak1() {
        return znak1;
    }

    public void setZnak1(char znak1) {
        this.znak1 = znak1;
    }

    public char getZnak2() {
        return znak2;
    }

    public void setZnak2(char znak2) {
        this.znak2 = znak2;
    }
}

