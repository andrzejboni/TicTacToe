package com.company;

public class Komunikat {

    public void przywitanie() { // Poki co mozliwa tylko gra we 2
        System.out.println("Witaj w grze kółko i krzyżyk. Wiersze i kolumny liczymy od 0. Krzyzyk zaczyna pierwszy.");
    }
    public void podajWsporzedne() {
        System.out.println("Podaj współrzędne gdzie chcesz postawić znak: ");
    }

    public void przegrana(char znak) {
        System.out.println("Niestety, " + znak +" przegrałeś, spróbuj jeszcze raz.");
    }

    public void wygrana(char znak) {
        System.out.println("Gratuluje, " + znak +"  wygrałeś!");
    }

    public void remis() {
        System.out.println("Remis, spróbuj jeszcze raz!");
    }

    public void zKimChceszZagrac() {
        System.out.println("Gra z komputerem wciśnij 1, z drugim graczem wciśnij 2 .");
    }

    public void nieMoznaPostawicZNaku() {
        System.out.println("Nie można postawić tutaj znaku!");
    }

    public void ruch(){
        System.out.println("Podaj współrzędne do następnego ruchu.");
    }
}
