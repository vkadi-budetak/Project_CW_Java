import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MainStreamFunctionalInt {
    public static void main(String[] args) {

        System.out.println("========= 1 ==========");
        List<Integer> evenNumbers =
                Stream.of(1,2,3,4,5,6,7)
                        .filter(x->x%2==0)
                        .toList();
        System.out.println(evenNumbers);

        System.out.println("========= 2 ==========");
        List<String> peopleGreetings =
                Stream.of("Vasya", "Petya", " Kolya")
                        .peek(x -> System.out.println("Hello " + x + "!!"))
                        .toList();

        System.out.println("========= 3 ==========");
        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("Lena");
        nameList.add("Sveta");
        nameList.add("Katy");
        nameList.add("Olya");

        Stream.generate(() -> {
            int value =(int)(Math.random()* nameList.size());
            return nameList.get(value);
                }).limit(3).forEach(System.out::println);


        System.out.println("========= 4 ==========");
        List<Integer> values = Stream.of("22", "33", "44")
        .map(Integer::valueOf).toList();
        System.out.println(values);

        System.out.println("========= 5 ==========");
        Stream.iterate(3, x->x*x).limit(5).forEach(System.out::println);






    }




}
