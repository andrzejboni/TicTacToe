package test.java.PlanszaClass;


import com.company.Plansza;
import org.junit.*;
import org.junit.Test;
//import sun.jvm.hotspot.utilities.Assert;

public class PlanszaCzyJestWygranyMethodTest {


    Plansza plansza;

    @Before
    public void setUp() {
        plansza = new Plansza(3, 3);
        plansza.setZnak(0, 2, plansza.getZnak1());
        plansza.setZnak(1, 1, plansza.getZnak1());
        plansza.setZnak(2, 0, plansza.getZnak1());
        plansza.czyJestWygrany('X');
        plansza.czyJestWygrany('O');
    }

    @Test
    public void czyJestWygranyKrzyzykNaUkosOdPrawejTest() {
//  Plansza - test case
//  [ ][ ][X]
//  [ ][X][ ]
//  [X][ ][ ]
        plansza.setZnak(0, 2, plansza.getZnak2());
        plansza.setZnak(1, 1, plansza.getZnak2());
        plansza.setZnak(2, 0, plansza.getZnak2());

        Assert.assertTrue(plansza.czyJestWygrany('X'));
    }
    @Test
    public void czyJestWygranyKrzyzykNaUkosOdLewejTest() {
//  Plansza - test case
//  [X][ ][ ]
//  [ ][X][ ]
//  [ ][ ][X]
        plansza.setZnak(0, 0, plansza.getZnak2());
        plansza.setZnak(1, 1, plansza.getZnak2());
        plansza.setZnak(2, 2, plansza.getZnak2());

        Assert.assertTrue(plansza.czyJestWygrany('X'));
    }
    @Test
    public void czyJestWygranyKrzyzykPionowoPierwszaKolumnaTest() {
//  Plansza - test case
//  [X][ ][ ]
//  [X][ ][ ]
//  [X][ ][ ]
        plansza.setZnak(0, 0, plansza.getZnak2());
        plansza.setZnak(1, 0, plansza.getZnak2());
        plansza.setZnak(2, 0, plansza.getZnak2());

        Assert.assertTrue(plansza.czyJestWygrany('X'));
    }

    @Test
    public void czyJestWygranyKrzyzykPionowoDrugaKolumnaTest() {
//  Plansza - test case
//  [ ][X][ ]
//  [ ][X][ ]
//  [ ][X][ ]
        plansza.setZnak(0, 1, plansza.getZnak2());
        plansza.setZnak(1, 1, plansza.getZnak2());
        plansza.setZnak(2, 1, plansza.getZnak2());

        Assert.assertTrue(plansza.czyJestWygrany('X'));
    }
    @Test
    public void czyJestWygranyKrzyzykPionowoTrzeciaKolumnaTest() {
//  Plansza - test case
//  [ ][ ][X]
//  [ ][ ][X]
//  [ ][ ][X]
        plansza.setZnak(0, 2, plansza.getZnak2());
        plansza.setZnak(1, 2, plansza.getZnak2());
        plansza.setZnak(2, 2, plansza.getZnak2());

        Assert.assertTrue(plansza.czyJestWygrany('X'));
    }
    @Test
    public void czyJestWygranyKrzyzykPoziomoPierwszyWierszKolumnaTest() {
//  Plansza - test case
//  [X][X][X]
//  [ ][ ][ ]
//  [ ][ ][ ]
        plansza.setZnak(0, 0, plansza.getZnak2());
        plansza.setZnak(0, 1, plansza.getZnak2());
        plansza.setZnak(0, 2, plansza.getZnak2());

        Assert.assertTrue(plansza.czyJestWygrany('X'));
    }
    @Test
    public void czyJestWygranyKrzyzykPoziomoDrugiWierszKolumnaTest() {
//  Plansza - test case
//  [ ][ ][ ]
//  [X][X][X]
//  [ ][ ][ ]
        plansza.setZnak(1, 0, plansza.getZnak2());
        plansza.setZnak(1, 1, plansza.getZnak2());
        plansza.setZnak(1, 2, plansza.getZnak2());

        Assert.assertTrue(plansza.czyJestWygrany('X'));
    }
    @Test
    public void czyJestWygranyKrzyzykPoziomoTrzeciWierszKolumnaTest() {
//  Plansza - test case
//  [ ][ ][ ]
//  [ ][ ][ ]
//  [X][X][X]
        plansza.setZnak(2, 0, plansza.getZnak2());
        plansza.setZnak(2, 1, plansza.getZnak2());
        plansza.setZnak(2, 2, plansza.getZnak2());

        Assert.assertTrue(plansza.czyJestWygrany('X'));
    }

    @Test
    public void czyJestWygranyKolkoNaUkosOdPrawejTest() {
//  Plansza - test case
//  [ ][ ][X]
//  [ ][X][ ]
//  [X][ ][ ]
        plansza.setZnak(0, 2, plansza.getZnak2());
        plansza.setZnak(1, 1, plansza.getZnak2());
        plansza.setZnak(2, 0, plansza.getZnak2());

        Assert.assertFalse(plansza.czyJestWygrany('O'));
    }
    @Test
    public void czyJestWygranyKolkoNaUkosOdLewejTest() {
//  Plansza - test case
//  [X][ ][ ]
//  [ ][X][ ]
//  [ ][ ][X]
        plansza.setZnak(0, 0, plansza.getZnak2());
        plansza.setZnak(1, 1, plansza.getZnak2());
        plansza.setZnak(2, 2, plansza.getZnak2());

        Assert.assertFalse(plansza.czyJestWygrany('O'));
    }
    @Test
    public void czyJestWygranyKolkoPionowoPierwszaKolumnaTest() {
//  Plansza - test case
//  [X][ ][ ]
//  [X][ ][ ]
//  [X][ ][ ]
        plansza.setZnak(0, 0, plansza.getZnak2());
        plansza.setZnak(1, 0, plansza.getZnak2());
        plansza.setZnak(2, 0, plansza.getZnak2());

        Assert.assertFalse(plansza.czyJestWygrany('O'));
    }

    @Test
    public void czyJestWygranyKolkoPionowoDrugaKolumnaTest() {
//  Plansza - test case
//  [ ][X][ ]
//  [ ][X][ ]
//  [ ][X][ ]
        plansza.setZnak(0, 1, plansza.getZnak2());
        plansza.setZnak(1, 1, plansza.getZnak2());
        plansza.setZnak(2, 1, plansza.getZnak2());

        Assert.assertFalse(plansza.czyJestWygrany('O'));
    }
    @Test
    public void czyJestWygranyKolkoPionowoTrzeciaKolumnaTest() {
//  Plansza - test case
//  [ ][ ][X]
//  [ ][ ][X]
//  [ ][ ][X]
        plansza.setZnak(0, 2, plansza.getZnak2());
        plansza.setZnak(1, 2, plansza.getZnak2());
        plansza.setZnak(2, 2, plansza.getZnak2());

        Assert.assertFalse(plansza.czyJestWygrany('O'));
    }
    @Test
    public void czyJestWygranyKolkoPoziomoPierwszyWierszKolumnaTest() {
//  Plansza - test case
//  [X][X][X]
//  [ ][ ][ ]
//  [ ][ ][ ]
        plansza.setZnak(0, 0, plansza.getZnak2());
        plansza.setZnak(0, 1, plansza.getZnak2());
        plansza.setZnak(0, 2, plansza.getZnak2());

        Assert.assertFalse(plansza.czyJestWygrany('O'));
    }
    @Test
    public void czyJestWygranyKolkoPoziomoDrugiWierszKolumnaTest() {
//  Plansza - test case
//  [ ][ ][ ]
//  [X][X][X]
//  [ ][ ][ ]
        plansza.setZnak(1, 0, plansza.getZnak2());
        plansza.setZnak(1, 1, plansza.getZnak2());
        plansza.setZnak(1, 2, plansza.getZnak2());

        Assert.assertFalse(plansza.czyJestWygrany('O'));
    }
    @Test
    public void czyJestWygranyKolkoPoziomoTrzeciWierszKolumnaTest() {
//  Plansza - test case
//  [ ][ ][ ]
//  [ ][ ][ ]
//  [X][X][X]
        plansza.setZnak(2, 0, plansza.getZnak2());
        plansza.setZnak(2, 1, plansza.getZnak2());
        plansza.setZnak(2, 2, plansza.getZnak2());

        Assert.assertFalse(plansza.czyJestWygrany('O'));
    }

}