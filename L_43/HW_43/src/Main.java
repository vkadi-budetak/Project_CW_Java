import java.util.Arrays;

import static java.util.Collections.reverse;

public class Main {
    public static void main(String[] args) {
        // 1. Рекурсивный расчет
        int number = 6;
        System.out.println("1.   =======================");
        int result = factorial(number); // считаем факториал
        System.out.println(result);
        result = factorialR(number);
        System.out.println("рекурсия -> " + result);

        System.out.println("2.   =======================");
        // нерекурсивный метод
        number = 10;
        result = sumToN(number);
        System.out.println(result);
        // рекурсивный метод
        result = sumToNR(number);
        System.out.println("рекурсия -> " + result);

        System.out.println("3.   =======================");
        number = 10;
        countDown(number);
        // рекурсивный метод
        countDownR(number);

        System.out.println("=== Задача 2 ===");
        // 2.
        // Напишите рекурсивные методы Разворот строки и Проверка слова на палиндром.
        String st = "qwerty";

        reversString(st);
        System.out.println();
        boolean res = isPalindrom(st);
        System.out.println("Строка палендром -> " + res);

        System.out.println("\n=== Рекурсия ===");
        reversStringR(st);
        boolean resR = isPalindromR(st);
        System.out.println("\nСтрока палендром -> " + resR);


    }

    private static void reversString(String s) {
// StringBuilder
//        StringBuilder sb = new StringBuilder(s);
//        sb.reverse();
//        System.out.println(sb);

        String[] words = s.split("");
        System.out.println(Arrays.toString(words));
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i]);
        }

    }

    private static boolean isPalindrom(String s) {
// StringBuilder
//        String reversed = new StringBuilder(s).reverse().toString();
//        return s.equalsIgnoreCase(reversed);

        int len = s.toLowerCase().length();
        for (int i = 0; i < len / 2; i++) {
            if (s.charAt(i) != s.charAt(len - 1 - i)) {
                return false;
            }
        }
        return true;
    }


    private static void reversStringR(String s) {
        if (s == null || s.length() <= 1) {
            System.out.print(s);
            return;
        }
        reversStringR(s.substring(1));
        System.out.print(s.charAt(0));
    }


    private static boolean isPalindromR(String s) {
        s = s.toLowerCase();
        if (s.length() <= 1) return true;
        if (s.charAt(0) != s.charAt(s.length() - 1)) {
            return false;
        }
        return isPalindromR(s.substring(1, s.length() - 1));

    }


    private static void countDownR(int n) {
        if (n <= 0) {
            System.out.println("\nStart!!");
            return;
        }
        System.out.print(n + "     ");
        countDownR(n - 1);
    }


    private static void countDown(int n) {
        for (int i = n; i > 0; i--)
            System.out.print(i + "     ");
        System.out.println("\nStart!");
    }

    private static int sumToNR(int n) {
        if (n <= 0) return 0;
        return n + sumToNR(n - 1);
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