import java.util.Arrays;

public class Main_HW_18_1 {
    public static void main(String[] args) {
        System.out.println("=======1=======");
        int[] ar = {1, 5, 9, 4, 8, 0, 3, 1};
        System.out.println(Arrays.toString(ar));
        int total = sum(ar);
        System.out.println(total);

        System.out.println("=======2=======");
        boolean[] arrBool = {true, false, true, true, false, false, true};
        System.out.println(Arrays.toString(arrBool));
        int totalTrue = count(arrBool);
        System.out.println(totalTrue);

        System.out.println("=======3=======");
        String[] arrString = {"Оля", "Виктор", "Настя", "Олег", "Катя", "Діма"};
        System.out.println(Arrays.toString(arrString));
        String arrPrintString = print(arrString);
        System.out.println(arrPrintString);

        System.out.println("=======4=======");
        String[] arrString1 = {"Оля", "Виктор", "Настя", "Олег", "Катя", "Діма"};
        System.out.println(Arrays.toString(arrString1));
        String arrPrintString1 = printComma(arrString1);
        System.out.println(arrPrintString1);

        System.out.println("=======5=======");
        int[] arr = {1, 5, 9, 4, 8, 0, 3, 1, 2};
        System.out.println(Arrays.toString(arr));
        System.out.println(sumOddIndex(arr));

        System.out.println("=======6=======");
        int[] arr1 = {1, 50, 9, 4, 8, 0, 3, 1, 2};
        ;
        System.out.println(Arrays.toString(arr1));
        System.out.println(maxArray(arr1));

        System.out.println("=======7=======");
        int[] arr2 = {1, 50, 9, 4, 8, 0, 3, 1, 2};
        ;
        System.out.println(Arrays.toString(arr1));
        System.out.println(avgArray(arr2));




    }

    private static double avgArray(int[] arr2) {
        int sum = 0;
        for (int i = 0; i < arr2.length; i++) {
            sum += arr2[i];
        }
        return (double) sum / arr2.length; // або 1.0* sum/ar.length
//        return 1.0 * sum / arr2.length;
//        return (sum + 0.0) / arr2.length;
//        return sum / arr2.length; //Error теряем дробную часть из-за целочисельного


    }

private static int maxArray(int[] arr1) {
    int max = arr1[0];

    for (int i = 1; i < arr1.length; i++) {
        if (arr1[i] > max) {
            max = arr1[i];
        }
    }
    return max;
}

private static int sumOddIndex(int[] ar) {
    int sum = 0;
    for (int i = 0; i < ar.length; i++) {
        if (i % 2 == 1) {
            sum += ar[i];
        }
    }
    return sum;
}

private static String printComma(String[] ar) {
    if (ar == null || ar.length == 0) return "";
    String s = "";
    for (int i = ar.length - 1; i >= 0; i--) {
        s = s + ar[i];
        if (i > 0) {
            s = s + ",";
        }
    }
    return s;
}

private static String print(String[] ar) {
    if (ar == null || ar.length == 0) return "";
    String s = "";
    for (int i = ar.length - 1; i >= 0; i--) {
        s = s + ar[i] + ", ";
    }
    return s;
}

private static int count(boolean[] arrBool) {
    int res = 0;
    for (boolean i : arrBool) {
        if (i)
            res += 1;     // res ++
    }
    return res;
}

private static int sum(int[] ar) {
    int res = 0;
    for (int i = 0; i < ar.length; i++) {
        res += ar[i];
    }
    return res;
}
}

/*
1 (15)
# Массивы: сумма элементов массива int[]

## 🧮 Задание
Реализуйте метод `sum(int[] ar)`, который возвращает сумму всех
элементов массива `int[]`. Покажите работу метода в `main`.

2 (16)
# Массивы: количество true в boolean[]

## 🧮 Задание
Реализуйте метод `count(boolean[] ar)`, который возвращает количество
элементов `true` в массиве `boolean[]`. Покажите работу метода в `main`.

3 (17)
# Массивы: печать имён в обратном порядке через запятую (с запятой в конце)

## 🧮 Задание
Реализуйте метод `print(String[] ar)`, который печатает элементы массива
строк **в обратном порядке** через запятую и запятую в конце.
Покажите работу метода в `main`.

4 (18)
# Массивы: печать имён в обратном порядке без последней запятой

## 🧮 Задание
Реализуйте метод `print(String[] ar)`, который печатает элементы массива
строк **в обратном порядке** через запятую **без** запятой в конце.
Покажите работу метода в `main`.

5(19)

# Массивы: сумма элементов с нечётными индексами

## 🧮 Задание
Реализуйте метод `sumOddIndex(int[] ar)`, который суммирует элементы
массива с нечётными индексами (1,3,5,...). Покажите работу метода в `main`.

6(20)

# Методы: максимум в массиве int[]

## 🧩 Задание
Реализуйте метод `maxArray(int[] ar)`, возвращающий максимальный элемент
массива. Покажите работу метода в `main`.

7(21)

# Методы: среднее значение массива int[] (double)

## 🧩 Задание
Реализуйте метод `avgArray(int[] ar)`, возвращающий среднее значение
элементов массива в виде `double`. Покажите работу в `main`.
 */