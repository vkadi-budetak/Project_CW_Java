import java.util.Arrays;
import java.util.List;

public class MultiParameterExample {
    public static void main(String[] args) {
        Pair<String, Integer> studentPair = Pair.of("Иванов", 25);
        System.out.println("Данные студента: " + studentPair);

        Pair<Double, Boolean> statusPair = Pair.of(3.14, true);

        List<String> list = Arrays.asList("A", "B");
        Pair<Long, List<String>> complexPair = Pair.of(1000L, list);

        System.out.println("Комплексная пара: " + complexPair);
        System.out.println("Тип значения в паре: " + complexPair.getValue());
        System.out.println("Ключ: " + complexPair.getKey() + ", значени: " + complexPair.getValue());
    }
}
