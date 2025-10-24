import java.util.ArrayList;

public class StudentSystem {
    public static void main(String[] args) {
    // 1. Создаем ArrayList для хранения имен студентов
        ArrayList<String> students = new ArrayList<>();

    // 2. Добавляем 5 студентов
    students.add("Алексей");
    students.add("Мари");
    students.add("Дмитрий");
    students.add("Анна");
    students.add("Елена");

    // 3 Выводим общее количество студентов
        System.out.println(students.size());

    // 4. Выводим  имя первого и последнего студента
        System.out.println("Первый студент: " + students.get(0));
        System.out.println("Последний студент: " + students.get(students.size() - 1));

    // 5. Проверяяем, если ли в списке студент с именем "Анна"
        boolean hasAnna = students.contains("Анна");
        boolean hasAlex = students.contains("Александр");
        System.out.println("Студент Анна найден : " + hasAnna);
        System.out.println("Студент Анна найден : " + (hasAnna ? "да" : "нет"));
        System.out.println("Студент Александр : " + (hasAlex ? " найден" : " не найден") +
                " в текущем списке студентов");

    // 5. Выводим весь список студентов
        System.out.println("Список всех студентов: " + students);

        // Альтернативный метод вцывода всего списка студентов
        System.out.println("\nПодстрочный список студентов:");

        for (int i = 0; i < students.size(); i++) {
            System.out.println((i+1)+ ". " + students.get(i));
        }





    }


}