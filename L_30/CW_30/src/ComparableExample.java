import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparableExample {
    public static void main(String[] args) {
        List<OurStudent> students = Arrays.asList(
                new OurStudent("Yun", 22, 3.5),
                new OurStudent("Petr", 20, 4.5),
                new OurStudent("Anna", 19, 4.8),
                new OurStudent("Alex", 21, 4.2),
                new OurStudent("Oleg", 21, 5.0),
                new OurStudent("Luba", 18, 3.8)
        );
        // До сортировки
        System.out.println("\n=== До сортировки ===");
        System.out.println("Список студентов: " + students);


        // Используем сортировку
        Collections.sort(students);
        System.out.println("\n=== До сортировки ===");
        System.out.println("Список студентов: " + students);

    }
}
