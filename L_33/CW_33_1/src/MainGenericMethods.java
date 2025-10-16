import java.util.Comparator;
import java.util.List;

public class MainGenericMethods {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(1, 2, 3, 1, 6, 4);
        List<String> stringList = List.of("Jack", "John", "Bob");
        List<Person> personList = List.of(new Person("jack", 10), new Person("bob", 35),
                new Person("john", 30));

        myPrint(integerList);
        myPrint(stringList);
        myPrint(personList);
        System.out.println("====================");


        System.out.println(max(integerList));
        System.out.println(max(stringList));

        System.out.println(max(personList, new PersonComparatorByAge()));

    }
    // МЕТОДЫ

    private static <T> T max(List<T> list, Comparator<T> comparator) {
        T result = list.get(0);
        for (T element: list)
            if (comparator.compare(element, result) > 0) result=element;
        return result;
    }


    //           generic             type return    type argument
    //              |                        |          |
    private static <T extends Comparable<T>> T max(List<T> list) {
        T result = list.get(0);
        for (T element : list)
            if (element.compareTo(result) > 0) result = element;
        return result;
    }

    private static <T> void myPrint(List<T> list) {
        for (T value : list) System.out.println(value + " | ");
        System.out.println();
    }
}
