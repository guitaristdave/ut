package seminars.third.hw;

import org.junit.Test;
import static org.junit.Assert.*;

public class NumberInIntervalCheckerTest {

    @Test
    public void testNumberInIntervalWithNumberInRange() {
        assertTrue(NumberInIntervalChecker.numberInInterval(50));
        assertTrue(NumberInIntervalChecker.numberInInterval(26));
        assertTrue(NumberInIntervalChecker.numberInInterval(99));
    }

    @Test
    public void testNumberInIntervalWithNumberOutOfRange() {
        assertFalse(NumberInIntervalChecker.numberInInterval(0));
        assertFalse(NumberInIntervalChecker.numberInInterval(25));
        assertFalse(NumberInIntervalChecker.numberInInterval(100));
        assertFalse(NumberInIntervalChecker.numberInInterval(101));
    }
}

