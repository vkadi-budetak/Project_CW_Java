import java.util.Comparator;
import java.util.List;

public class MainProgrammerTasks {
    public static void main(String[] args) {
        Task t1 = new Task(1, "task1", "process", 2);
        Task t2 = new Task(2, "task2", "process", 5);
        Task t3 = new Task(3, "task3", "test", 3);
        Task t4 = new Task(4, "task4", "done", 8);
        Task t5 = new Task(5, "task5", "process", 1);
        Task t6 = new Task(6, "task6", "process", 1);

        Programmer p1 = new Programmer("Jack","Berlin",
                List.of(t1,t2,t3, new Task(7,"task7","process",1)));
        Programmer p2 = new Programmer("Lena","Berlin",
                List.of(t4,t2,t3,t5, new Task(7,"task7","process",1)));
        Programmer p3 = new Programmer("Roma","Potsdam",
                List.of(t1,t2,t6 ));

        List<Programmer> programmers = List.of(p1, p2, p3);
        System.out.println(programmers);

        // фильтруем програмистов из берлина
        System.out.println("Программисты из Берлина");
        programmers.stream()
                .filter(p -> p.getCity().equals("Berlin"))
                .map(p -> p.getName() + " -> " + p.getCity())
                .forEach(System.out::println);

        List<Task> list1 = getTasks(programmers);
        list1.forEach(System.out::println);
    }

    private static List<Task> getTasks(List<Programmer> programmers) {
        List<Task> list = programmers.stream()
                .flatMap(programmer -> programmer.getTasks().stream())  // разбиваю на маленькие под стримы
                .distinct()
                .sorted(new Comparator<Task>() { // сортируем!
                    @Override
                    public int compare(Task o1, Task o2) {
                        return Integer.compare(o1.getNum(), o2.getNum());
                    }
                })
                .toList();
        return list;
    }
}
/*
Дан список Programmer(String name, String city, List<Task>  tasks).
 * Каждый программист  имеет список задач
 * Task (int Number, String description,
 * String status, int daysInProcessing) .
 * Причем, одна задача может быть в списке у нескольких программистов
 * Сформировать лист из всех задач.
 */