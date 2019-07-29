package test.java.PlanszaClass;
import com.company.Plansza;
import org.junit.*;
import org.junit.Test;

public class PlanszaClassOtherMethodsTest {
    private Plansza plansza;

    @Before
    public void setUp() {
        plansza = new Plansza(3, 3);

        plansza.setZnak(0, 2, plansza.getZnak1());
        plansza.setZnak(1, 1, plansza.getZnak2());
        plansza.setZnak(2, 0, plansza.getZnak1());
    }

    @Test
    public void wyczyscPlanszeMethodTest() {

        plansza.wyczyscPlansze();

        for (int i = 0; i < plansza.getDlugosc(); i++) {
            for (int j = 0; j < plansza.getSzerokosc(); j++) {
                Assert.assertEquals(plansza.getPlansza(i, j), ' ');
            }
        }
    }
//  Plansza - test case
//  [null]    [null]  [O]
//  [null]    [X]     [ ]
//  [0]       [2]     [W]

    @Test
    public void czyMoznaPostawicZnakCyfra() {
        plansza.setZnak(2, 0, '0');
        Assert.assertFalse(plansza.czyMoznaPostawicZnak(2, 0));
    }

    @Test
    public void czyMoznaPostawicZnakCyfra2() {
        plansza.setZnak(2, 1, '2');
        Assert.assertFalse(plansza.czyMoznaPostawicZnak(2, 1));
    }
    @Test
    public void czyMoznaPostawicZnakLitera() {
        plansza.setZnak(2, 2, 'W');
        Assert.assertFalse(plansza.czyMoznaPostawicZnak(2, 2));
    }

    @Test
    public void czyMoznaPostawicZnakX() {
        Assert.assertFalse(plansza.czyMoznaPostawicZnak(1, 1));
    }
    @Test
    public void czyMoznaPostawicZnakO() {
        Assert.assertFalse(plansza.czyMoznaPostawicZnak(0, 2));
    }

    @Test
    public void czyMoznaPostawicZnakNull() {
        Assert.assertFalse(plansza.czyMoznaPostawicZnak(0, 0)); // dla nulla
    }
    @Test
    public void czyMoznaPostawicZnak3() {
        plansza.setZnak(1, 2, ' ');
        Assert.assertTrue(plansza.czyMoznaPostawicZnak(1, 2));
    }
}
