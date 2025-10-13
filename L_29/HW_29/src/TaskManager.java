import java.util.Iterator;
import java.util.LinkedList;

public class TaskManager {
    //Создаю пустой LinkedList для хранения задач
    public LinkedList<Task> tasks = new LinkedList<>();

    //Реализовую метод добавления в начало списка
    public void addUrgentTask(Task task) {
        tasks.addFirst(task);
    }

    //Реализовую метод добавления в конец списка
    public void addRegularTask(Task task) {
        tasks.offerLast(task);
    }

    //Реализовую метод удалить по ID
    public boolean completeTask(int id) {
        //Получаем Iterator и безопасно удаляем
        Iterator<Task> it = tasks.iterator();

        //Обходим коллекцию
        while (it.hasNext()) {
            Task task = it.next();
            if (it.next().getId() == id) {
                it.remove(); // безопасное удпления черед итератор
                System.out.println("Объект удален: " + task);
                return true;
            }
        }
        System.out.println("Задача с ID " + id + " не найдена.");
        return false;
    }

    //Реализовую метод показать все задачи
    public void displayTasks() {
        if (tasks.isEmpty()){
            System.out.println("Список задач пуст");
            return;
        }

        System.out.println("=== Список задач ===");
        int i = 1;
        for (Task t : tasks) {
            System.out.printf("%d. %s%n", i++, t);
        }
    }
}
