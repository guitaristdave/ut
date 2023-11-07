package seminars.third.hw;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class NumberCheckerTest {

    @Test //Проверяет, что метод возвращает true для четных чисел.
    public void testEvenNumber() {
        assertTrue(NumberChecker.evenOddNumber(4));
        assertTrue(NumberChecker.evenOddNumber(0));
        assertTrue(NumberChecker.evenOddNumber(-2));
        assertTrue(NumberChecker.evenOddNumber(-100));
    }

    @Test //Проверяет, что метод возвращает false для нечетных чисел.
    public void testOddNumber() {
        assertFalse(NumberChecker.evenOddNumber(7));
        assertFalse(NumberChecker.evenOddNumber(11));
        assertFalse(NumberChecker.evenOddNumber(-3));
        assertFalse(NumberChecker.evenOddNumber(-99));
    }

    @Test //Проверяет, что метод возвращает true для нуля (0).
    public void testZero() {
        assertTrue(NumberChecker.evenOddNumber(0));
    }

    @Test //Проверяет, что метод корректно обрабатывает Integer.MAX_VALUE - 1 (максимальное четное число) и Integer.MAX_VALUE (максимальное нечетное число).
    public void testMaxValue() {
        assertTrue(NumberChecker.evenOddNumber(Integer.MAX_VALUE - 1));
        assertFalse(NumberChecker.evenOddNumber(Integer.MAX_VALUE));
    }

    @Test //Проверяет, что метод корректно обрабатывает Integer.MIN_VALUE + 1 (минимальное нечетное число) и Integer.MIN_VALUE (минимальное четное число).
    public void testMinValue() {
        assertTrue(NumberChecker.evenOddNumber(Integer.MIN_VALUE + 1));
        assertFalse(NumberChecker.evenOddNumber(Integer.MIN_VALUE));
    }
}

