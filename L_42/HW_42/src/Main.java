import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String text = "lmn vf ab a lmn ab lmn";

        displayWordsCount(text);
    }

    private static void displayWordsCount(String text) {
        Arrays.stream(text.split(" "))  // ➜ ["lmn", "vf", "ab", "a", "lmn", "ab", "lmn"]
                .collect(Collectors.groupingBy(
                        Function.identity(),    // группируем по самому слову
                        Collectors.counting()   // считаем сколько раз встречается
                ))
                .entrySet().stream() // переходим до пары (key=value)
                .sorted(
                        Map.Entry.<String, Long>comparingByValue(Comparator.reverseOrder())
                                .thenComparing(Map.Entry.comparingByKey())
                )
                .forEach(e -> System.out.println(e.getKey() + " -> " + e.getValue()));
    }


}

/*
static void displayWordCounts(String text) - выведет на консоль,
сколько раз встречается то или иное слово в строке, отсортированное по количеству вхождений,
а если в нескольких строках встречается одно и то же значение, то по алфавиту,
используя функциональные стримы!!!!!!

String text = "lmn vf ab a lmn ab lmn" - на входе.
На выходе
lmn -> 3
ab -> 2
a -> 1
vf -> 1
 */