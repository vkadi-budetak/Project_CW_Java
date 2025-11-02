import java.util.ArrayList;
import java.util.Arrays;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        int[] number = {20, 30, 40, 50, 60, 70, 80, 90, 100};
        System.out.println("1.   =======================");
        // 1. Напишите рекурсивный метод розворота массива на месте.
        reversArray(number);
        System.out.println();
        reversArray_R(number);

        System.out.println("2.   =======================");
        // 2. Напишите рекурсивный метод сумирования элементов массива.
        sumElErrays(number);
        int result = sumElErrays_R(number);
        System.out.println(result);

        System.out.println("3.   =======================");
        //3. Напишите рекурсивный метод поиска минимума в листье.
        ArrayList<Integer> list = new ArrayList<>();
        list.add(22);
        list.add(34);
        list.add(42);
        list.add(56);
        list.add(63);
        searchMinArrays(list);
        searchMinArrays_R(list);


        System.out.println("4.   =======================");
        // 4. Напишите рекурсивный метод возведения числа в степень.
        int n = 5;
        int step = 2;
        double res = Math.pow(n, step);
        System.out.println(res);
        double resR = numberInTheSquare_R(n, step);
        System.out.println(resR);

        System.out.println("5.   =======================");
        // 5. Напишите рекурсивный метод преобразования числа в двоичный вид. (остаток от деления)
        n = 10;
        int remainder = 3;
        double resRemainder = n % remainder;
        System.out.println(resRemainder);

        double resRemainderR = n % remainder;
        System.out.println(resRemainderR);
    }

    private static int remainder_R(int n, int r) {
        if (n < r) {
            return n;
        }
        return remainder_R(n - r, r);

    }


    private static int numberInTheSquare_R(int n, int s) {
        if (s == 0) {
            return 1;
        }
        return n * numberInTheSquare_R(n, s - 1);
    }

    private static void searchMinArrays_R(ArrayList<Integer> l) {
        int min = searchMinArraysHelper_R(l, 0);
        System.out.println(min);
    }

    private static int searchMinArraysHelper_R(ArrayList<Integer> l, int i) {
        if (i == l.size() - 1) {
            return l.get(i);
        }
        int minRest = searchMinArraysHelper_R(l, i + 1);
        return Math.min(l.get(i), minRest);
    }

    private static void searchMinArrays(ArrayList<Integer> l) {
        int min = l.get(0);
        for (Integer i : l) {
            if (i < min) {
                min = i;
            }
        }
        System.out.println(min);
    }

    private static int sumElErrays_R(int[] n) {
        return sumHelper(n, 0);
    }

    private static int sumHelper(int[] n, int index) {
        if (index >= n.length) {
            return 0;
        }
        return n[index] + sumHelper(n, index + 1);
    }


    private static void sumElErrays(int[] n) {
        int sum = 0;
        for (int i = 0; i < n.length; i++) {
            sum += n[i];
        }
        System.out.println(sum);
    }


    private static void reversArray(int[] n) {
        for (int i = n.length - 1; i >= 0; i--) {
            System.out.print(n[i] + " ");
        }
    }

    private static void reversArray_R(int[] n) {
        reversArrayHelper_R(n, 0, n.length - 1);
        System.out.println(Arrays.toString(n));
    }

    private static void reversArrayHelper_R(int[] n, int st, int end) {
        if (st >= end) return;
        int temp = n[st];
        n[st] = n[end];
        n[end] = temp;
        reversArrayHelper_R(n, st + 1, end - 1);
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