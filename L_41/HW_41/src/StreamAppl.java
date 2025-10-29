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
                new Movie("e", 2023, 5.0),
                new Movie("e", 2021, 5.0)
        };

        System.out.println(Arrays.toString(movies));

        // 1. вывод уникальный рейтинги фильмов
        System.out.println("=== уникальный рейтинги фильмов ===");
        Stream<Movie> stream = Arrays.stream(movies);
        stream.map(movie -> movie.rating)
                .distinct()
                .forEach(System.out::println);

        // 2. выводим первые 2 уникальные года фильмов
        System.out.println("=== 2 уникальные года фильмов ===");
        Arrays.stream(movies)
                .map(movie -> movie.year)
                .distinct()
                .limit(2)
                .forEach(System.out::println);

        // 3. выводим только второй уникальный год из всех фильмов
        System.out.println("=== 2 уникальный год из всех фильмов ===");
        Arrays.stream(movies)
                .map(movie -> movie.year)
                .distinct().skip(1)
                .limit(1)
                .forEach(System.out::println);

        // 4. выводим на консоль только предпоследний элемент вашего массива.
        System.out.println("=== предпоследний элемент вашего массива ===");
        Arrays.stream(movies)
                .skip(movies.length - 2)
                .limit(1)
                .forEach(System.out::println);
    }
}

/*
Для класса Movie из классной работы решите следующие задачи
1. Создайте стрим, который даст вам и выведет на консоль
уникальные рейтинги фильмов.
2. Создайте стрим, который даст вам и выведет на консоль
только 2 первых уникальных года фильмов.
3. Создайте стрим, который даст вам и выведет на консоль
только второй уникальный год из всех фильмов.
4. Создайте стрим, который выведет на консоль только
предпоследний элемент вашего массива.
 */