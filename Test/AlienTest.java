import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class AlienTest {

    static Alien tester;

    @BeforeClass
    public static void setTester(){tester = new Alien("Tester");}

    @Test
    public void testWearArmour() {
        tester.eat(1);
        assertEquals(tester.getDefense(), 112);
        assertEquals(tester.getDamage(), 10);
    }
}