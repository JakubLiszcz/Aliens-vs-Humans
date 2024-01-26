import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class HumanTest {

    static Human tester;

    @BeforeClass
    public static void setTester(){tester = new Human("Tester");}

    @Test
    public void testWearArmour() {
        tester.wearArmour(1);
        assertEquals(tester.getDefense(), 112);
        assertEquals(tester.getDamage(), 10);
    }
}