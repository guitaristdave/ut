package seminars.third.hw;

public class NumberChecker {
    public static boolean evenOddNumber(int number) {
        // Используем оператор % (деление по модулю) для проверки остатка от деления на 2.
        // Если остаток равен 0, то число четное, иначе - нечетное.
        if (number % 2 == 0) {
            return true;  // Четное число
        } else {
            return false; // Нечетное число
        }
    }


}
