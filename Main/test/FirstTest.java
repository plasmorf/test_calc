package ru.suhorukov.calculator.test;
import ru.suhorukov.calculator.Main;
import junit.framework.TestCase;
/**
 * Created by Администратор on 24.09.2015.
 */
public class FirstTest extends TestCase {
    public void setUp() throws Exception{
        super.setUp();
    }
    public void tearDown() throws Exception{
        super.tearDown();
    }

    public void testMaxInt() throws  Exception{
        int result = Main.maxInt(1, 3);
        assertFalse(1==result);
    }

    public void testAvgInt() throws Exception{
        double result = Main.avg(2000,1000);
        assertEquals(1500, result);
    }
}
