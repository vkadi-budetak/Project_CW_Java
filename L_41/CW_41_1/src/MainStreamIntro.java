import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Функциональный стрим (STREAM)
 */

public class MainStreamIntro {
    public static void main(String[] args) {
        Movie[] movies = {
                new Movie("a", 2022, 4.0),
                new Movie("b", 2021, 4.5),
                new Movie("c", 2022, 4.5),
                new Movie("d", 2021, 3.5),
                new Movie("e", 2021, 5.0),
                new Movie("e", 2021, 5.0)
        };

        System.out.println(Arrays.toString(movies));

        // хочу вывести только -> названия, год только 21, и рейтенг > 4.0, sort rating name
        displayMoviesTitle(movies, 2021, 4.0);
        System.out.println("===========================================");
        displayMoviesTitleStream(movies, 2021, 4.0);

        System.out.println("===========================================");
        // хочу получить поток фильмов и оставить уникальные
        Stream<Movie> stream = Arrays.stream(movies);
        stream.distinct().forEach(System.out::println); // distinct() - отбирает только уникальные

        System.out.println("===========================================");
        // lazy
        stream = Arrays.stream(movies).skip(2).limit(2); // skip - отбрось 2 єлемента; limit - возьми 2
        movies[2] = new Movie("abc", 1900, 1);
        stream.forEach(System.out::println); // ТЕРМИНАЛЬНАЯ операция

        System.out.println("===========================================");
        Arrays.stream(movies).filter(m -> m.year==2021)
                .peek(m -> System.out.println(">>>>>>>>>>" + m)) // через peek можна заглянуть внутрь и что едет по конвееру
                .skip(1).limit(2).forEach(System.out::println); // skip - отбрось 1 єлемент; limit - возьми 2

        System.out.println("===========================================");
        // печатаем последний элемент
        Arrays.stream(movies).skip(movies.length - 1)
                .forEach(System.out::println);
//                .forEach(m -> System.out.println(">>>>" + m)); // КАК вариант выывода на принт

        System.out.println("===========================================");
        // Складываем в лист STREAM
        List<Movie> myList= Arrays.stream(movies)
                .peek(movie -> System.out.println("Next movie is "+movie.title))
                .skip(2)
                .limit(2)
                .toList(); // .collect(Collectors.toList());
        System.out.println(myList);

        System.out.println("===========================================");
        Stream.of(1,2,3,4,5,6,7,8,1,2,3).takeWhile(n -> n< 7) // прекрати поток на все что после 7
                .forEach(System.out::println);
        System.out.println("===========================================");
        Stream.of(1,2,3,4,5,6,7,8,1,2,3).dropWhile(n ->n<7) // отбрасывай пока не случится события
                .forEach(a-> System.out.println(a));
        System.out.println("===========================================");
        System.out.println(getRundomNumbers(10,0,11)); // делаю набор случаных чисел от min = 0 до max = 11;

        System.out.println("===========================================");
        IntStream.iterate(1, pred -> pred*2).limit(10) // получаю квадраты моих значений
                .forEach(System.out::println);

        System.out.println("===========================================");
        Stream.generate(() -> 123)                                      // получаю постоянно значения
                .limit(3).forEach(System.out::println);


    }

    private static List<Integer> getRundomNumbers(int count, int min, int max) {
        return new Random().ints(count, min, max).boxed()
                .toList();
    }

    // использования стримов
    private static void displayMoviesTitleStream(
            Movie[] movies, int year, double rating) {
        Arrays.stream(movies)
                .filter(m -> m.year==year && m.rating>rating)
                .sorted((o1,o2) -> {
                    int res = Double.compare(o1.rating, o2.rating);
                    return res ==0 ? o1.title.compareTo(o2.title): res;
                })
                .map(m -> m.title)
                .forEach(System.out::println);
    }


    private static void displayMoviesTitle(
            Movie[] movies, int year, double rating) {
        int count = 0;
        for (Movie m : movies)
            if (m.year == year && m.rating > rating)
                count++;

        Movie[] temp = new Movie[count];

        for (Movie m : movies) {
            if (m.year == year && m.rating > rating)
                temp[--count] = m;
        }

        Arrays.sort(temp, new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                int res = Double.compare(o1.rating, o2.rating);
                return res == 0 ? o1.title.compareTo(o2.title) : res;
            }
        });

        for (Movie m : temp) {
            System.out.println(m.title);
        }
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