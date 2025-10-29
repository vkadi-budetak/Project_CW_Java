import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main2 {
    public static void main(String[] args) {
        // 2 4 1 7 4 -> 01201234010123456701234

        Stream.of(2, 4, 1, 7, 4)
                .flatMapToInt(x -> IntStream.range(0, x + 1))
                .forEach(System.out::println);
        System.out.println();


        ArrayList<Company> list = new ArrayList<>(Arrays.asList(
                new Company("AAA",
                        new ArrayList<String>(
                                Arrays.asList("Vasya", "Petya", "Kolya")
                        )),
                new Company("BBB",
                        new ArrayList<String>(
                                Arrays.asList("Olya", "Petya", "Kolya")
                        )),
                new Company("CCC",
                        new ArrayList<String>(
                                Arrays.asList("Vasya", "Misha", "Kolya")
                        ))
        )
        );
        list.stream()
                .flatMap(c -> c.employee.stream())                   // разбиваю на мелкие части
                .distinct().forEach(System.out::println);
        System.out.println();

        System.out.println("==== метод reduce ====");
        System.out.println(Stream.of(1, 2, 3, 4, 5, 6) // factorial - превращает в одно число
                .reduce(1, (acc, n) -> acc * n));


        System.out.println(Stream.of(1, 2, 3, 4, 5, 6) // factorial - превращает в одно число
                .reduce((acc, n) -> acc * n).orElse(1));


        System.out.println(Stream.of(1, 2, 3, 4, 5, 6) // sum even elements
                .reduce(0, (acc, n) -> {
                    if (n % 2 == 0) return acc + n;
                    return acc;
                })
        );

        // методы
        System.out.println(Stream.of(1, 2, 3, 4, 5, 6)
                .anyMatch(e -> e > 3)
        );
        System.out.println(Stream.of(1, 2, 3, 4, 5, 6)
                .allMatch(e -> e > 0)
        );
        System.out.println(Stream.of(1, 2, 3, 4, 5, 6)
                .noneMatch(e -> e > 33)
        );
        System.out.println(Stream.of(1, 2, 3, 4, 5, 6)
                .findAny().get()
        );
        System.out.println(Stream.of(1, 2, 3, 4, 5, 6)
                .findFirst().get()
        );


    }
}
