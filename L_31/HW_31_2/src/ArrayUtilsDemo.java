import java.util.ArrayList;
import java.util.List;

public class ArrayUtilsDemo {
    public static void main(String[] args) {
        List<String> languages = new ArrayList<>(List.of("Java", "Python", "Swift", "C++", "Fortran"));
        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5));

        ArrayUtils.printArray(languages);
        ArrayUtils.printArray(numbers);

        System.out.println(ArrayUtils.getFirst(languages));
        System.out.println(ArrayUtils.getLast(numbers));

        ArrayUtils.swap(languages, 0, 2);
        ArrayUtils.printArray(languages);

    }
}

/**
 * Generic методы для работы с массивами
 * Описание: Создайте класс ArrayUtils с generic методами для работы с массивами.
 * <p>
 * Требования: Реализуйте следующие static generic методы:
 *
 * <T> void printArray(T[] array) - печать всех элементов массива
 * <T> T getFirst(T[] array) - получение первого элемента (или null, если массив пуст)
 * <T> T getLast(T[] array) - получение последнего элемента (или null, если массив пуст)
 * <T> void swap(T[] array, int i, int j) - обмен элементов по индексам
 * Пример использования:
 * <p>
 * String[] languages = {"Java", "Python", "Swift", "C++", "Fortran"};
 * Integer[] numbers = {1, 2, 3, 4, 5};
 * <p>
 * ArrayUtils.printArray(languages);
 * ArrayUtils.printArray(numbers);
 * <p>
 * System.out.println(ArrayUtils.getFirst(languages));
 * System.out.println(ArrayUtils.getLast(numbers));
 * <p>
 * ArrayUtils.swap(languages, 0, 2);
 * ArrayUtils.printArray(languages);
 */