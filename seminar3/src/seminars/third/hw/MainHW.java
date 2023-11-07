package seminars.third.hw;

import static seminars.third.hw.NumberChecker.evenOddNumber;
import static seminars.third.hw.NumberInIntervalChecker.numberInInterval;

public class MainHW {

    public static void main(String[] args) {
        // HW 3.1. Нужно покрыть тестами метод на 100%
        // Метод проверяет, является ли целое число записанное в переменную n, чётным (true) либо нечётным (false).
        int num = 10;
        boolean isEven = evenOddNumber(num);
        if (isEven) {
            System.out.println(num + " является четным числом.");
        } else {
            System.out.println(num + " является нечетным числом.");
        }


        // HW 3.2. Нужно написать метод который проверяет, попадает ли переданное число в интервал (25;100) и возвращает true, если попадает и false - если нет,
        // покрыть тестами метод на 100%
        int numberToCheck = 50; // Замените этот числовой литерал на тот, который вы хотите проверить
        boolean isInRange = numberInInterval(numberToCheck);

        if (isInRange) {
            System.out.println(numberToCheck + " попадает в интервал (25;100)");
        } else {
            System.out.println(numberToCheck + " не попадает в интервал (25;100)");
        }
    }


}
