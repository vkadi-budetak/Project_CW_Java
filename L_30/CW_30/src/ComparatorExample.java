import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
    public static void main(String[] args) {
        List<OurStudent> students = Arrays.asList(
                new OurStudent("Yun", 22, 3.5),
                new OurStudent("Petr", 20, 4.5),
                new OurStudent("Anna", 19, 4.8),
                new OurStudent("Максим", 19, 3.0),
                new OurStudent("Тарас", 23, 4.1),
                new OurStudent("Alex", 21, 4.2),
                new OurStudent("Oleg", 21, 5.0),
                new OurStudent("Luba", 18, 3.8)
        );
        // До сортировки
        System.out.println("\n=== До сортировки ===");
        System.out.println("Список студентов: " + students);


        // Используем сортировку по возрасту (возрастание)
        Collections.sort(students, new AgeStudentComparator());
        System.out.println("\n=== Сортировка списка студентов по возрасту ===");
        System.out.println("Список студентов: " + students);

        // Используем сортировку по имени (возрастание)
        Collections.sort(students, new NameStudentComparator());
        System.out.println("\n=== Сортировка списка студентов по имени ===");
        System.out.println("Список студентов: " + students);

        // Используем сортировку по имени (Убыванию)
        // ИСПОЛЬЗУЕМ АНОНИМНЫЙ КЛАС (new Comparator<OurStudent>()), А НЕ ОБЬЕКТ!!!
        Collections.sort(students, new Comparator<OurStudent>() {
            @Override
            public int compare(OurStudent student1, OurStudent student2) {
                return student2.getName().compareTo(student1.getName());
            }
        }); // создаем анонимный клас, а не новый обьект!!!!

        System.out.println("\n=== Сортировка списка студентов по имени ===");
        System.out.println("Список студентов: " + students);


    }
}
