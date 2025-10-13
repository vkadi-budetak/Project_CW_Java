import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// КОМБИНИРОВАНЫЙ - СЛОЖНАЯ СОРТИРОВКА - пример
public class ComplexComparatorExample {
    public static void main(String[] args) {
        List<OurStudent> students = Arrays.asList(
                new OurStudent("Peter", 20, 4.5),
                new OurStudent("Anna", 19, 4.8),
                new OurStudent("Alex", 21, 4.2),
                new OurStudent("John", 21, 4.3),
                new OurStudent("Ulija", 21, 4.9),
                new OurStudent("Phill", 21, 4.2),
                new OurStudent("Sarah", 21, 4.3),
                new OurStudent("Gleb", 21, 4.9),
                new OurStudent("Bred", 24, 4.2),
                new OurStudent("Margo", 22, 4.3),
                new OurStudent("Tom", 23, 4.9)
        );

        // До сортировки
        System.out.println("\n=== До сортировки ===");
        System.out.println("Список студентов: " + students);

        // Сложная сортировка: сначала по оценке (по убыванию),
        // затем по возрасту (возрастание), затем по имени
        Comparator<OurStudent> complexComparator =
                Comparator.comparingDouble(OurStudent::getGrade).reversed() // По оценке (убывание)
                        .thenComparingInt(OurStudent::getAge)   // затем по возрасту (возрастание)
                        .thenComparing(OurStudent::getName);    // по имени

        students.sort(complexComparator);
        // Эквивалентно
        // Collections.sort(students, complexComparator);
        System.out.println("\n=== Сокращенный forEach ===");
        students.forEach(System.out::println);

        System.out.println("\n=== Полный forEach ===");
        for (OurStudent student : students) {
            System.out.println(student);
        }
    }
}
