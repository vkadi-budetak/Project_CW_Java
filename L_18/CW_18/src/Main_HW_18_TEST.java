import java.util.Arrays;

public class Main_HW_18_TEST{
    public static void main(String[] args) {
        int[] ar1={1,4,8,3,1,9,4,0};
        System.out.println(Arrays.toString(ar1));
        System.out.println("------------- 1-------------");
        System.out.println(sum(ar1));
        System.out.println("--------------- 2 ---------");
        boolean[] ar2={true,true,false,true};
        System.out.println(count(ar2));
        System.out.println("----------------- 3 ------------");
        String[] ar3={"Vasya", "Petya", "Kolya"};
        print3(ar3);
        System.out.println("----------------- 4 --------------");
        print4(ar3);
        System.out.println("------------- 5 ------------------");
        System.out.println(Arrays.toString(ar1));
        System.out.println(sumOddIndex(ar1));
        System.out.println("------------- 6 ----------------");
//        Arrays.fill(ar1,-5);
        System.out.println(maxArray(ar1));
        System.out.println("------------- 7 -----------------");
        System.out.println(avgArray(ar1));

    }

    private static double avgArray(int[] ar) {
        int sum=0;
        for (int i = 0; i < ar.length; i++) sum+=ar[i] ;
        return (double) sum / ar.length;
//        return 1.0 * sum / ar.length;
//        return (sum+0.0) / ar.length;
//        return sum / ar.length; // ERROR теряем дробную часть из-за целочисленного деления
    }

    private static int maxArray(int[] ar) {
        int max=ar[0];
//        int max=0; ERROR
//        int max=Integer.MIN_VALUE; // решение верное, но не универсальное
        for (int a : ar) if (a>max) max=a;
        return max;
    }

    private static int sumOddIndex(int[] ar) {
        int res=0;
        for (int i=0; i<ar.length; i++){
            if (i%2!=0){
                res+=ar[i];
            }
        }
//        for (int i=1; i<ar.length; i+=2) res+=ar[i];
        return res;
    }

    private static void print4(String[] ar) {
        for (int i=ar.length-1; i>0; i--)
            System.out.print(ar[i]+" , ");
        System.out.println(ar[0]);
    }

    private static void print3(String[] ar) {
        for (int i=ar.length-1; i>=0; i--) System.out.print(ar[i]+" , ");
        System.out.println();
    }

    private static int count(boolean[] ar) {
        int res=0;
        for (boolean a: ar){
            res = a ? res+1 : res;
        }
        return res;
    }

    private static int sum(int[] ar1) {
        int res=0;
        for (int a: ar1){
            res+=a;
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
