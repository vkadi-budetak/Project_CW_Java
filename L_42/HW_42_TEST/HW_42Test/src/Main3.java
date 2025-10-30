import java.util.*;
import java.util.stream.*;

public class Main3 {

    // Метод принимает строку и выводит количество слов
    static void displayWordCounts(String text) {

        Arrays.stream(text.split(" "))                // превращаем строку в поток слов (разделяем по пробелу)
                .collect(Collectors.groupingBy(       // группируем одинаковые слова
                        s -> s,                      // ключ — само слово
                        Collectors.counting()         // значение — сколько раз слово встретилось
                ))
                .entrySet().stream()                 // превращаем мапу в поток пар (слово -> число)
                .sorted(                             // сортируем пары
                        Comparator
                                .<Map.Entry<String, Long>>comparingLong(e -> e.getValue()) // сначала по количеству
                                .reversed()          // по убыванию (3, 2, 1...)
                                .thenComparing(Map.Entry::getKey) // затем по слову по алфавиту
                )
                .forEach(e ->                        // выводим каждую пару
                        System.out.println(e.getKey() + " -> " + e.getValue())
                );
    }

    public static void main(String[] args) {
        String text = "lmn vf ab a lmn ab lmn";
        System.out.println("Строка: " + text);
        System.out.println("==============================\n" + "Подсчет слов: ");
        displayWordCounts(text);
    }
}