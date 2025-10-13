import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class TaskManager {
    private LinkedList<Task> tasks;

    public TaskManager() {
        this.tasks = new LinkedList<>();
    }

    // Добавить срочную задачу (добавить в начало списка)
    public void addUrgentTask(Task task) {
        tasks.addFirst(task);
        System.out.println("Срочная задача добавлена: " + task.getTitle());
    }

    // Добавить обычную задачу (в конец списка)
    public void addRegularTask(Task task) {
        tasks.addLast(task);
        System.out.println("Обычная задача добавлена: " + task.getTitle());
    }

    // Завершить задачу (удалить задачу по ID)
    public boolean completeTask(int id) {
        // Используем итератор для безопасного удаления задачи
        Iterator<Task> iterator = tasks.iterator();
        while (iterator.hasNext()) {
            Task task = iterator.next();
            if (task.getId() == id) {
                iterator.remove();  // Безопасное удаление через итератор
                System.out.println(" Задача " + task.getTitle() + " выполнена.");
                return true;
            }
        }
        System.out.println("Задача с ID " + id + " не найдена.");
        return false;
    }

    // Отобразить все задачи
    public void displayTasks() {
        if (tasks.isEmpty()) {
            System.out.println("Список задач пуст");
            return;
        }

        System.out.println("\n=== Список задач ===");
        int counter = 1;

        for (Task task : tasks) {
            System.out.println("[ID: " + counter + "] " + task.getTitle() +
                    " (Приоритет: ) " + task.getPriority() + ")");
            counter++;
        }

        System.out.println("Всего задач: " + getTaskCount());
    }

    public int getTaskCount() {
        return tasks.size();
    }
}

