package test.java.LogikaClass;

import com.company.Komunikat;
import com.company.Logika;
import com.company.Plansza;
import com.company.Scan;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
//import sun.rmi.runtime.Log;

public class rozgrywkaTest {
    private Plansza plansza;
    Komunikat komunikat;
    Scan scan;
    Logika logika;

    @Before
    public void setUp() {
        plansza = new Plansza(3, 3);
        komunikat = new Komunikat();
        scan = new Scan();
        logika = new Logika(komunikat, plansza, scan);

        plansza.setDlugosc(3);          // !!!!!! WAŻNE
        plansza.setSzerokosc(3);        // !!!!!!
        plansza.setWielkoscPlanszy(3, 3);    // !!!!!
        logika.rozgrywka();
    }

//    @Test
//    public void wyczyscPlanszeMethodTest() {
//        scan.

}
