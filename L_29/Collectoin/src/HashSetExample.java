import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        // Создание
        Set<String> fruits = new HashSet<>(); // убрать дубликаты

        fruits.add("Яблоки");
        fruits.add("Бананы");
        fruits.add("Груши");
        fruits.add("Сливы");
        fruits.add("Яблоки");

        System.out.println("Фрукты: " + fruits);

        boolean hasBanana = fruits.contains("Бананы");
        System.out.println(hasBanana);
        System.out.println(fruits.size());

        System.out.println("-- Удаляем сливы ---");
        fruits.remove("Сливы");

        System.out.println("Фрукты: " + fruits);

        System.out.println("-------------------");

        String[] array = {"A", "B", "A", "A", "C", "D"};
        Set<String> unique = new HashSet<>();

        for (String s : array) {
            unique.add(s);
        }

        System.out.println("\nМассив: " + Arrays.toString(array));
        System.out.println("Уникальные элементы из массива: " + unique);
    }
}
