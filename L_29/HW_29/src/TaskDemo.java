import java.util.LinkedList;

public class TaskDemo {
    public static void main(String[] args) {

        TaskManager manager = new TaskManager();

        //Добавляем задачи
        manager.addUrgentTask(new Task(3, "Срочный звонок клиенту", 5));
        manager.addUrgentTask(new Task(1, "Подготовить презентацию", 5));
        manager.addRegularTask(new Task(2, "Купить продукты", 2));

        manager.displayTasks();
    }
}