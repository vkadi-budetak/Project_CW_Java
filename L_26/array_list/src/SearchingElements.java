import java.util.ArrayList;

public class SearchingElements {
    public static void main(String[] args) {
        ArrayList<String> subjects = new ArrayList<>();
        subjects.add("Мамтиматика");
        subjects.add("Физика");
        subjects.add("Химия");
        subjects.add("Биология");
        subjects.add("Физика");

        System.out.println("Предметы: " + subjects);
        // поиск наличия элемента
        boolean hasPhysics = subjects.contains("Физика");
        System.out.println("Если ли Физика? " + (hasPhysics ? "да" : "нет"));

        // Поиск индекса первого вхождения
        int firstPhysicsIndex = subjects.indexOf("Физика");

        // Поиск индекса последнего вхождения
        int lastPhysicsIndex = subjects.lastIndexOf("Физика");
        System.out.println("Индекс первой физики: " + firstPhysicsIndex);
        System.out.println("Индекс последней физики: " + lastPhysicsIndex);

        // Посик несуществующего элемента
        int historyIndex = subjects.indexOf("История");
        System.out.println("Индекс истории: " + historyIndex);

        // Проверка наличия всех элементов из другой коллекции
        ArrayList<String> checkSubjects = new ArrayList<>();
        checkSubjects.add("Мамтиматика");
        checkSubjects.add("Физика");
        ArrayList<String> checkSubjects2 = new ArrayList<>();
        checkSubjects2.add("Мамтиматика");
        checkSubjects2.add("История");

        boolean hasAll = subjects.containsAll(checkSubjects);
        System.out.println("\nВсе ли придметы есть из контрольного списка: " + (hasAll ? "да" : "нет"));
        System.out.println("\nВсе ли придметы есть из контрольного списка: " + (subjects.containsAll(checkSubjects2) ? "да" : "нет"));

    }
}
