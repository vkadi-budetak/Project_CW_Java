import java.util.*;

public class ProblemExample {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Petr", 20, 4.5),
        new Student("Anna", 19, 4.8),
        new Student("Alex", 21, 4.2)
        );
        // До сортировки
        System.out.println("Список студентов: " + students);

        // ClassCastException! - если нет методов сравнения в классе
        // на основании которого создан обьект(экземпляр)
        // Collection.sort(students);

        // После сортировки
        System.out.println("Список студентов: " + students);

        Set<Student> sortedStudents = new TreeSet<>(students);
    }

    ;


}
