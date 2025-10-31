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
        result = sumToN_R(number);
        System.out.println(result);


        System.out.println("3.   =======================");
        // нерекурсивный метод
        number = 10;
        countDow(number);
        countDow_R(number);

        System.out.println("4.   =======================");
        System.out.println(reversString("Hello"));
        System.out.println(reversString_R("Hello"));

        System.out.println("5.   =======================");
        System.out.println(isPalindrome("level"));
        System.out.println(isPalindrome2("level"));
        System.out.println(isPalindrome_R("level"));

        System.out.println("6.   =======================");
        // посчитать длину строки
        System.out.println(strLength_R("Hello"));

        System.out.println("7.   =======================");
        // сколько раз встречается l в слове
        System.out.println(countChar_R("Hello", 'l'));

        System.out.println("8.   =======================");
        // фибаначи - 1 1 2 3 5 8 13....
        System.out.println(fibonacci(7));
        System.out.println(fibonacci_R(7));

        System.out.println("8.   =======================");
        // бинарный поиск
        int[] array = {10, 20, 30, 40, 50};
        System.out.println(binarySearch(array, 20));
        System.out.println(binarySearch_R(array, 20));


    }

    private static int binarySearch_R(int[] array, int value) {
        return binarySearchRec(array, value, 0, array.length - 1);

    }

    private static int binarySearchRec(int[] array, int value, int l, int r) {
        if (l > r) return -1;
        int m = (l + r) / 2;
        if (array[m] == value) return m;
        else if (value > array[m])
            l = m + 1;
        else
            r = m - 1;
        return binarySearchRec(array, value, l, r);

    }

    private static int binarySearch(int[] array, int value) {
        int l = 0, r = array.length - 1, m = 0;

        while (l <= r) {
            m = (l + r) / 2;
            if (array[m] == value)
                return m;
            else if (value > array[m])
                l = m + 1;
            else r = m - 1;

        }
        return -1;

    }

    private static int fibonacci_R(int count) {
        if (count <= 1) return count;
        return fibonacci_R(count - 1) + fibonacci_R(count - 2);
    }

    private static int fibonacci(int count) {// 1 1 2 3 5 8 13...
        int n1 = 0;
        int n2 = 1;
        int res = n1 + n2;

        while (count > 2) {
            n1 = n2;
            n2 = res;
            res = n1 + n2;
            count--;
        }
        return res;

    }

    private static int countChar_R(String s, char ch) {
        if (s.isEmpty()) return 0;
        return (s.charAt(0) == ch ? 1 : 0)
                + countChar_R(s.substring(1), ch);
    }

    private static int strLength_R(String s) {
        if (s.isEmpty()) return 0;
        return strLength_R(s.substring(1)) + 1;

    }

    private static boolean isPalindrome_R(String s) {
        if (s.length() <= 1) return true;
        if (s.charAt(0) != s.charAt(s.length() - 1)) return false;
        return isPalindrome_R(s.substring(1, s.length() - 1));
    }

    private static boolean isPalindrome2(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString().equals(s);
    }

    private static boolean isPalindrome(String s) {
        for (int i = 0, j = s.length() - 1; i < j; i++, j--)
            if (s.charAt(i) != s.charAt(j)) return false;
        return true;
    }

    private static String reversString_R(String s) {
        if (s.isEmpty()) return "";
        if (s.length() == 1) return s;

        return reversString_R(s.substring(1)) + s.charAt(0);

    }

    private static String reversString(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }


    private static void countDow_R(int n) {
        if (n == 0) {
            System.out.println("\nStart!!");
            return;
        }
        System.out.print(n + "     ");
        countDow_R(n - 1);
    }

    private static void countDow(int n) {
        for (int i = n; i > 0; i--)
            System.out.print(i + "     ");
        System.out.println("\nStart!");
    }

    private static int sumToN_R(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        return n + sumToN_R(n - 1);
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
HW_44_TEXT
1. Напишите рекурсивный метод розворота массива на месте.
2. Напишите рекурсивный метод сумирования элементов массива.
3. Напишите рекурсивный метод поиска минимума в листье.
4. Напишите рекурсивный метод возведения числа в степень.
5. Напишите рекурсивный метод преобразования числа в двоичный вид. (остаток от деления)

 */