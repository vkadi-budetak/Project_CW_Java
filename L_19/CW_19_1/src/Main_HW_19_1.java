import java.util.Arrays;

public class Main_HW_19_1 {
    public static void main(String[] args) {
        System.out.println("=====1======");
        double[] r = {3.5, 44.1, 18, 2.8};
        //        System.out.println(Arrays.toString(sCircles(r)));
        double[] areas = sCircles(r);
        for (double a : areas) {                    // округляем значения
            System.out.printf("%.2f ", a);
        }
        System.out.println();

        System.out.println("=====2======");
        int[] ar = {20, 1, 44, 23, 7, 13};
        System.out.println(Arrays.toString(ar));
        System.out.println(indexLastMinElemInArray(ar));

        System.out.println("=====3======");
        int[] ar1 = {1, 5, 3, 5, 5, 2, 0, 5, 1, 3, 5};
        int value = 33;
        System.out.println("Array: " + Arrays.toString(ar1) + " value: " + value);
        System.out.println(countContValueInArray(ar1, value));

        System.out.println("=====4======");
        int[] ar2 = {1, 5, 3, 5, 5, 2, 0, 5, -1, 3, 5};
        int value1 = 2;
        System.out.println("Array: " + Arrays.toString(ar2));
        System.out.println(valueInArrayIndexFirst(ar2, value1));

        System.out.println("=====5======");
        int[] ar3 = {1, 5, 3, 5, 5, 2, 0, 5, -1, 3, 5};
        System.out.println("Array: " + Arrays.toString(ar3));
        System.out.println(Arrays.toString(reversArray(ar3)));


    }

    private static int[] reversArray(int[] ar) {
        if (ar == null || ar.length < 2) return ar;
        for (int i = 0, j = ar.length - 1; i < j; i++, j--) {
            int temp = ar[i];
            ar[i] = ar[j];
            ar[j] = temp;
        }
        return ar;
    }

    private static int valueInArrayIndexFirst(int[] ar, int value) {
        int res = -1;
        for (int i = 0; i < ar.length; i++)
            if (ar[i] == value) {
//                return i;
                res = i;
                break;
            }
        return res;
    }

    private static int countContValueInArray(int[] ar, int value) {
        int res = 0;
        for (int x : ar) {
            if (x == value) {
                res++;
            }
        }
        return res;
    }

    private static int indexLastMinElemInArray(int[] ar) {
        int min = 0;
        for (int i = 1; i < ar.length; i++) {
            if (ar[i] <= ar[min]) {
                min = i;
            }
        }
        return min;
    }

    public static double[] sCircles(double[] r) {
        double[] result = new double[r.length];
        for (int i = 0; i < r.length; i++) {
            result[i] = Math.PI * r[i] * r[i];
        }
        return result;
    }
}

/*
1(22)
        # Методы: площади кругов по массиву радиусов

## 🧩 Задание
Реализуйте метод sCircles(double[] r), который возвращает
массив площадей кругов s=π*r^2 для каждого радиуса.
Покажите работу метода в main.

 2(23)
 # Методы: индекс последнего минимального элемента массива

## 🧩 Задание
Реализуйте метод indexLastMinElemInArray(int[] ar),
который возвращает индекс последнего минимального элемента массива.
Покажите работу метода в main.

3(24)
# Методы: количество вхождений значения в массиве

## 🧩 Задание
Реализуйте метод countContValueInArray(int[] ar,int value),
возвращающий количество вхождений value в массиве. Покажите работу
в main.

4(25)
# Методы: индекс первого вхождения значения

## 🧩 Задание
Реализуйте метод valueInArrayIndexFirst(int[] ar,int value), который
возвращает индекс первого вхождения value или -1, если нет совпадений.
Покажите работу в main.

5(26)
# Методы: разворот массива на месте

## 🧩 Задание
Реализуйте метод reversArray(int[] ar), который разворачивает массив
на месте. Покажите работу в main.
 */