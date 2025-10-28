import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamAppl {
    public static void main(String[] args) {
        Movie[] movies = {
                new Movie("a", 2022, 4.0),
                new Movie("b", 2021, 4.5),
                new Movie("c", 2022, 4.5),
                new Movie("d", 2021, 3.5),
                new Movie("e", 2021, 5.0),
                new Movie("e", 2021, 5.0)
        };
            /**
            * Как можно порождать STREAM
            */
        ArrayList<Movie> list = new ArrayList<>(Arrays.asList(movies));

        // 1 - STREAM from array (Создавать с масива)
        Stream<Movie> s1 = Arrays.stream(movies);

        // 2 - STREAM from collection (Из колекции)
        Stream<Movie> s2 = list.stream();

        // 3 - STREAM from String (Из строки)
        IntStream s3 = "Hello world".chars();

        // 4 -  STREAM from values (из значения)
        Stream<String> s4 = Stream.of("a1", "a2", "a3");
        Stream<Integer> s41 = Stream.of(1,2,3,4,5);

        // 5 - STREAM with builder  (из значения)
        Stream<Object> s5 = Stream.builder().add("a1").add("a2")
                .add("a3").build();
    }
}
