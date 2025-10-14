import lessons.lesson_31.lesson.GenericsMethods;

import java.util.Arrays;

/**
 * Демонстрационный класс для показа работы обобщенных методов.
 *
 * Этот класс содержит примеры использования обобщенных методов из класса GenericsMethods.
 * Демонстрирует, как один и тот же обобщенный метод может работать с разными типами данных
 * без необходимости создания отдельных методов для каждого типа.
 */
public class GenericsMethodsDemon {

    /**
     * Главный метод программы, демонстрирующий работу обобщенных методов.
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {

        // === ДЕМОНСТРАЦИЯ МЕТОДА swap() СО СТРОКАМИ ===
        System.out.println("\n=== Работа со строками (swap) ===");

        // Создаем массив строк для демонстрации
        String[] names = { "Анна", "Борис", "Глеб", "Петр", "Елизавета"};
        System.out.println("До перестановки: " + Arrays.toString(names));

        // Вызываем обобщенный метод swap для типа String
        // Компилятор автоматически определяет тип T как String
        lessons.lesson_31.lesson.GenericsMethods.swap(names, 2, 4); // Меняем местами "Глеб" и "Елизавета"
        System.out.println("После перестановки: " + Arrays.toString(names));

        // === ДЕМОНСТРАЦИЯ МЕТОДА swap() С ЧИСЛАМИ ===
        System.out.println("\n=== Работа со числами (swap) ===");

        // Создаем массив чисел для демонстрации
        Integer[] numbers = { 1, 2, 3, 4, 5 };
        System.out.println("До перестановки: " + Arrays.toString(numbers));

        // Вызываем тот же обобщенный метод swap, но теперь для типа Integer
        // Компилятор автоматически определяет тип T как Integer
        lessons.lesson_31.lesson.GenericsMethods.swap(numbers, 2, 4); // Меняем местами числа 3 и 5
        System.out.println("После перестановки: " + Arrays.toString(numbers));

        // === ДЕМОНСТРАЦИЯ МЕТОДА printPair() С РАЗНЫМИ ТИПАМИ ===
        System.out.println("\n=== Работа с информацией (printPair) ===");

        // Вызываем метод с двумя параметрами разных типов: String и Integer
        // T = String, U = Integer
        lessons.lesson_31.lesson.GenericsMethods.printPair("Java", 17);

        // Вызываем метод с другими типами: Double и Boolean
        // T = Double, U = Boolean
        GenericsMethods.printPair(3.14, true);

    }
}
