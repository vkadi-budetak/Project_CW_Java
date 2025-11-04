import java.util.Arrays;
import java.util.List;

public class MainRecursionAdvanced {
    public static void main(String[] args) {
        System.out.println("=== 1. Разворот массива ===");
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("До: " + Arrays.toString(arr));
        reverseArray(arr, 0, arr.length - 1);
        System.out.println("После: " + Arrays.toString(arr));

        System.out.println("\n=== 2. Сумма элементов массива ===");
        int[] nums = {5, 10, 15, 20};
        int sum = sumArray(nums, 0);
        System.out.println("Сумма: " + sum);

        System.out.println("\n=== 3. Минимум в списке ===");
        List<Integer> list = List.of(12, 3, 45, 2, 18);
        int min = findMin(list, 0, list.get(0));
        System.out.println("Минимум: " + min);

        System.out.println("\n=== 4. Возведение в степень ===");
        int base = 2;
        int exponent = 5;
        int power = powerRecursive(base, exponent);
        System.out.println(base + "^" + exponent + " = " + power);

        System.out.println("\n=== 5. Двоичное представление числа ===");
        int number = 13;
        String binary = toBinary(number);
        System.out.println("Число " + number + " в двоичной системе: " + binary);
    }

    // 1. Разворот массива на месте
    public static void reverseArray(int[] arr, int left, int right) {
        if (left >= right) return;
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        reverseArray(arr, left + 1, right - 1);
    }

    // 2. Суммирование элементов массива
    public static int sumArray(int[] arr, int index) {
        if (index >= arr.length) return 0;
        return arr[index] + sumArray(arr, index + 1);
    }

    // 3. Поиск минимума в списке
    public static int findMin(List<Integer> list, int index, int currentMin) {
        if (index >= list.size()) return currentMin;
        int newMin = Math.min(currentMin, list.get(index));
        return findMin(list, index + 1, newMin);
    }

    // 4. Возведение числа в степень
    public static int powerRecursive(int base, int exponent) {
        if (exponent == 0) return 1;
        return base * powerRecursive(base, exponent - 1);
    }

    // 5. Преобразование числа в двоичный вид
    public static String toBinary(int n) {
        if (n == 0) return "0";
        if (n == 1) return "1";
        return toBinary(n / 2) + (n % 2);
    }
}

/*
HW_44_TEST
1.Напишите рекурсивный метод разворота массива на месте.
2.Напишите рекурсивный метод суммирования элементов массива.
3.Напишите рекурсивный метод поиска минимума в листе.
4.Напишите рекурсивный метод возведения числа в степенью.
5.Напишите рекурсивный метод преобразования числа в двоичный вид.
 */