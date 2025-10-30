import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Main1 {
    public static void main(String[] args) {
        String text = "lmn vf ab a lmn ab lmn";
        displayWordCounts(text);
    }

    private static void displayWordCounts(String text) {
        Map<String, Long> words = Arrays.stream(text.split(" "))
                .collect(Collectors.groupingBy(w -> w, Collectors.counting()));
        words.entrySet().stream().sorted((v1, v2) -> {
                    int value = Long.compare(v2.getValue(), v1.getValue());
                    if (value == 0) return v1.getKey().compareTo(v2.getKey());
                    return value;
                })
                .forEach(entry -> System.out.println(entry.getKey() + " -> "
                        + entry.getValue()));
    }
}
