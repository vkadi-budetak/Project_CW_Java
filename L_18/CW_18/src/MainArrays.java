import java.util.Arrays;

public class MainArrays {
    public static void main(String[] args) {
        int[] ar1={1,5,9,4,8,0,3,1};
        System.out.println(ar1);
        System.out.println(Arrays.toString(ar1));
        AnyMethodsForArrays.printArray(ar1);

        double[] ar2={1.1,3.5,2.2,1.1,-5.0};
        System.out.println(ar2);
        System.out.println(Arrays.toString(ar2));
        AnyMethodsForArrays.printArray(ar2);

        boolean[] ar3=new boolean[5];
        System.out.println(Arrays.toString(ar3));
        ar3[1]=!ar3[1];
        System.out.println(Arrays.toString(ar3));

        int[] ar4={10,16,13,-22};
        int[] arMerge= AnyMethodsForArrays.mergeIntArrays(ar1,ar4);
        AnyMethodsForArrays.printArray(ar1);
        AnyMethodsForArrays.printArray(ar4);
        AnyMethodsForArrays.printArray(arMerge);

        int[] arMerge2= AnyMethodsForArrays.mergeIntArrays2(ar1,ar4);
        AnyMethodsForArrays.printArray(arMerge2);

        System.out.println("====================");
        /// Розвернемо масив
        AnyMethodsForArrays.printArray(ar4);
        AnyMethodsForArrays.reverseArray(ar4);
        AnyMethodsForArrays.printArray(ar4);

        System.out.println("=====================");
        ///  мініиальне значення в масиві шукаємо
        AnyMethodsForArrays.printArray(ar2);
        System.out.println(AnyMethodsForArrays.minInArray(ar2));
        System.out.println(AnyMethodsForArrays.indexMaxInArrayFirst(ar2)); /// вертає індекс максимального значення

        System.out.println("====================");
        String [] ar5={"str1", "str2", "str3", "str2"};
        System.out.println(Arrays.toString(ar5));
        System.out.println(AnyMethodsForArrays.countValueInArray(ar5, "str1")); /// Шукаємо рядок у String

        System.out.println("====================");
        String[] names = {"Vasya", "Olya", "Tatyana"};
        System.out.println(Arrays.toString(names));
        System.out.println(AnyMethodsForArrays.avgLenghtNamesInArray(names)); /// Шукаємо середню довжину строк в масиві




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
