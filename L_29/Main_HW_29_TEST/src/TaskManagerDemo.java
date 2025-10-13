public class TaskManagerDemo {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        // Создаем конкретные задачи
        Task task1 = new Task(1, "Подготовить презентацию", 5);
        Task task2 = new Task(2, "Купить продукты", 2);
        Task task3 = new Task(3, "Срочный звонок клиенту", 5);
        Task task4 = new Task(4, "Прочитать почту", 3);

        // Добавляем задачи
        manager.addRegularTask(task1);
        manager.addRegularTask(task2);
        manager.addUrgentTask(task3);   // Срочная - в начало
        manager.addRegularTask(task4);

        // Отображаем список
        manager.displayTasks();

        // Выполняем задачу
        System.out.println("\n--- Выполняем задачу с ID 1 ---");
        manager.completeTask(1);

        // Отображаем обновленный список задач
        System.out.println("\n--- Обновленный список задач ---");
        manager.displayTasks();

        // Пытаемся выполнить несуществующую задачу
        System.out.println("\n--- Пытаемся выполнить несуществующую задачу ---");
        manager.completeTask(95);
    }
}