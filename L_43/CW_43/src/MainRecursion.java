/**
 * Рекурсия
 */
public class MainRecursion {
    public static void main(String[] args) {
        // Рекурсивный расчет
        int number = 6;
        System.out.println("1.   =======================");
        int result = factorial(number); // считаем факториал
        System.out.println(result);
        result = factorialR(number);
        System.out.println(result);

        System.out.println("2.   =======================");
        // нерекурсивный метод
        number = 10;
        result = sumToN(number);
        System.out.println(result);


        System.out.println("3.   =======================");
        // нерекурсивный метод
        number = 10;
        countDow(number);

    }

    private static void countDow(int n) {
        for (int i = n; i > 0; i--)
            System.out.print(i + "     ");
        System.out.println("\nStart!");
    }

    private static int sumToN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++)
            sum += i;
        return sum;
    }

    private static int factorialR(int n) {
        if (n <= 1) return 1;
        return n * factorialR(n - 1);
    }

    private static int factorial(int n) {
        int res = 1;
        for (int i = 1; i <= n; i++) res *= i;
        return res;

    }
}

/*
HW_43_TEXT
1. Напишите рекурсивные методы суммирования и обратного отсчета сделанные
в классе обычными циклами.
2.*****
 Напишите рекурсивные методы Разворот строки и Проверка слова на палиндром.

 */