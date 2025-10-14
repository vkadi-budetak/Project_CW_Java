import java.util.Arrays;

public class GenericsMethodsDemon {
    public static void main(String[] args) {
        System.out.println("\n=== Робота со строками (swap) ===");
        String[] names = {"Анна", "Борис", "Глеб", "Петр", "Елизавета"};
        System.out.println("До перестановки: " + Arrays.toString(names));
        GenericsMethods.swap(names, 2, 4);
        System.out.println("После перестановки: " + Arrays.toString(names));

        System.out.println("\n=== Робота со числами (swap) ===");
        Integer[] numbers = {1, 2, 3, 4, 5};
        System.out.println("До перестановки: " + Arrays.toString(numbers));
        GenericsMethods.swap(numbers, 2, 4);
        System.out.println("После перестановки: " + Arrays.toString(numbers));

        System.out.println("\n=== Робота с информацией (PrintPair) ===");
        GenericsMethods.printPair("Java", 17);
        GenericsMethods.printPair(3.14, true);
    }
}
