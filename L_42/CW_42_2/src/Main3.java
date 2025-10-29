import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Main3 {
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

        List<String> listTitles = Arrays.stream(movies)
                .map(m -> m.title)
                .distinct()
                .collect(Collectors.toList()); // собирает в что-то
        System.out.println(listTitles);
        listTitles.add("qqqq");  // добавляем что-то
        System.out.println(listTitles);

        Set<Integer> set = Arrays.stream(movies)
                .map(m->m.year)
                .collect(Collectors.toSet());

        Map<String, Double> map = Arrays.stream(movies)
                .collect(Collectors.toMap(m -> m.title,
                        m -> m.rating,
                        (v1, v2) ->v1
                        ));
        System.out.println(map);

        // метод  joining - обьеденить
        String [] array1 = {"aaa", "bbb", "ccc"};
        System.out.println(Arrays.stream(array1)
                .collect(Collectors.joining(" , "))
        );
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