import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Main2 {

    public static void main(String[] args) {
        String text = "lmn vf ab a lmn ab lmn";
        displayWordCounts(text);
    }

    private static void displayWordCounts(String text) {
        String[] words = text.split(" ");
        Arrays.stream(words)
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) ->
                        e1.getValue() == e2.getValue()
                                ? e1.getKey().compareTo(e2.getKey())
                                : Long.compare(e2.getValue(), e1.getValue()))
                .forEach(e ->
                        System.out.printf("%s->%d\n", e.getKey(), e.getValue()));

    }
}
