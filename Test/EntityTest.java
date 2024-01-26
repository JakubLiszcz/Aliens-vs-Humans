import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class EntityTest {

    static Entity tester;

    @BeforeClass
    //Create new tester before each test
    public static void setTester(){
        tester = new Entity("Tester");
    }

    //Every test tests getter and setter of each method

    @Test
    public void testHealth() {
        tester.setHealth(100);
        assertEquals(100, tester.getHealth());
    }


    @Test
    public void testDamage() {
        tester.setDamage(100);
        assertEquals(100, tester.getDamage());
    }


    @Test
    public void testDefense() {
        tester.setDefense(100);
        assertEquals(200, tester.getDefense());
    }

    @Test
    public void testPosition() {
        tester.setPosition(3);
        assertEquals(3, tester.getPosition());
    }

    @Test
    public void testToString() {
        assertEquals("Tester", tester.toString());
    }

}