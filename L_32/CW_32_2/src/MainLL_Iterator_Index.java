import java.util.LinkedList;
import java.util.List;

public class MainLL_Iterator_Index {
    public static void main(String[] args) {
        /**
         * РОБОТА С LinkedList
         */
        // формируем лист
        List<Integer> integers = new LinkedList<>();
        int size = 1_000_000;
        int counter = 0;
        for (int i = 0; i < size; i++) {
            integers.add(counter++);
        }
//        System.out.println("=== PrintIterator ===");
//        printUseIterator(integers);
        System.out.println("=== PrintIndex ===");
        printUseIndexes(integers);


    }

    private static void printUseIndexes(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    } // Будет очень долго перебирать

    private static void printUseIterator(List<Integer> list) {
        for (Integer i : list) {
            System.out.println(i);
        }
    }
}
