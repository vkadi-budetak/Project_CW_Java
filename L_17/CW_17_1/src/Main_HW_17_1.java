public class Main_HW_17_1 {
    public static void main(String[] args) {
        System.out.println("==========1==========");
        int print = 7;
        printDollarsInCol(print);
        System.out.println("==========2==========");
        int number = 5;
        factorial(number);
        System.out.println("===========3=========");
        int min = 3;
        int max = 7;
        sumEvenNumbersInRange(min, max);
        System.out.println("==========4==========");
        int l = 3, r = 30, quantity = 5;
        sumOddRandomNumbersInRange(l, r, quantity);
        System.out.println("==========5==========");
        min = 2;
        max = 9;
        printEvenNumbersInRangeReversInCol(min, max);

    }

    private static void printEvenNumbersInRangeReversInCol(int min, int max) {
        for (int i = max; i >= min; i--) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }


    private static void sumOddRandomNumbersInRange(int l, int r, int quantity) {
        for (int i = l; i <= r; i++) {
            int intRand = (int) (l + Math.random() * (r - l + 1));
            if (intRand % 2 != 0) {
                quantity += i;
            }
        }
        System.out.println(quantity);
    }

    private static void sumEvenNumbersInRange(int min, int max) {
        int summa = 0;
        for (int i = min; i <= max; i++) {
            if (i % 2 == 0) {
                summa += i;
            }
        }
        System.out.println(summa);
    }

    private static void factorial(int number) {

        int summa = 1;
        for (int i = 1; i <= number; i++) {
            summa *= i;
        }
        System.out.println(summa);
    }

    private static void printDollarsInCol(int dollars) {
        for (int i = 1; i <= dollars; i++)
            System.out.println("$");
    }
}

/*
1(10)
# Циклы: вывести $ в столбик N раз
## 🔁 Задание
Реализуйте метод `printDollarsInCol(int dollars)`,
который печатает `$` в столбик указанное число раз.
Проверьте метод в `main`.
2(11)
# Циклы: факториал числа
## 🔁 Задание
Реализуйте метод `factorial(int number)`, возвращающий факториал числа.
Проверьте работу метода в `main`.
3(12)
# Циклы: сумма чётных чисел в диапазоне
## 🔁 Задание
Реализуйте метод `sumEvenNumbersInRange(int min,int max)`,
возвращающий сумму всех чётных чисел между `min` и `max` включительно.
Проверьте в `main`.
4(13)
# Циклы: сумма N случайных нечётных чисел
## 🔁 Задание
Реализуйте метод `sumOddRandomNumbersInRange(int l,int r,int quantity)`,
 который возвращает сумму `quantity` случайных нечётных чисел
 в диапазоне `[l;r]`.
Проверьте работу в `main`.
5(14)
# Циклы: чётные числа в обратном порядке
## 🔁 Задание
Реализуйте метод `printEvenNumbersInRangeReversInCol(int min,int max)`,
который печатает все чётные числа от `max`
до `min` в столбик. Проверьте работу метода в `main`.
 */