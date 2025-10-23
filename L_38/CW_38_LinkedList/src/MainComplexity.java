import java.util.Arrays;

/**
 * АЛГОРИТМЫ
 */
public class MainComplexity {
    public static void main(String[] args) {
        System.out.println("COMPLEXITY");
        // O(1)  -  констатная сложность
        int[] array = {1, 2, 3, 4, 5};
        double middle = (array[0] + array[array.length - 1]) / 2;
        System.out.println(middle);

        array[3] = 225;

        // O(log(n))  - логарифмическая сложносность
        int index = Arrays.binarySearch(array, 4);
        System.out.println(index);

        // O(n)  - линейная сложность
        int sum = 0;
        for (int n : array)
            sum += n;
        System.out.println(sum);

        // O(n*log(n)
        Arrays.sort(array);  // - quickSort, timsort, mergeSort

        // O(n^2) bubbleSort, SelectionSort
        sum = 0; // сумма всех возможных пар элементов в массиве
        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array.length; j++)
                sum += array[i] + array[j];
        System.out.println(sum);

        // O(2^n)   - рекурсивная генерация чисел Фибоначи, или обход дерева
        // с парными развилкаками


        // 5*O[n^5] + 100*O[n^3] + 222*O[n^2] + 4*O[1] + 12345 -> O[n^5]
    }
}
