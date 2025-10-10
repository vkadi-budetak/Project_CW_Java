import java.util.LinkedList;
import java.util.List;

public class LikedListExample {
    public static void main(String[] args) {
        LinkedList<String> cities = new LinkedList<>(); // конкретно
        List<String> ListCities = new LinkedList<>(); // обобщенный

        //Добавления
        cities.add("Киев");
        cities.add("Львов");
        cities.add("Харьков");
        cities.add("Житомир");
        cities.add("Одесса");

        System.out.println("Список городов: " + cities);

        // Доступ к элементам
        String first = cities.getFirst();
        String last = cities.getLast();
        String byIndex = cities.get(3);

        System.out.println("Первый: " + first);
        System.out.println("Последний: " + last);
        System.out.println("По индексу: " + byIndex);

        // Удаления элементов
        cities.removeFirst();
        cities.removeLast();
        cities.remove(1);
        cities.remove("Житомир");

        System.out.println("Список городов после удаления: " + cities);

        // Использование как очередь (FIFO)
        System.out.println("\n== Имитация очереди (FIFO) ==");

        LinkedList<Integer> queue = new LinkedList<>();
        queue.offer(22);          // метод добавления в конец (безопасны способ)
        queue.offer(26);          // метод добавления в конец (безопасны способ)
        queue.offer(33);          // метод добавления в конец (безопасны способ)

        System.out.println("Очередь: " + queue);
        System.out.println("Первый в очереди: " + queue.peek()); // Просмотреть первый элемент
        System.out.println("Извлечь: " + queue.poll()); // Извлечь первый элемент
        System.out.println("Очередь после извлечения: " + queue);

        // Использование как стек (LIFO)
        System.out.println("\n== Имитация стека (LIFO) ==");
        LinkedList<String> stack = new LinkedList<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        System.out.println("Стек начальный: " + stack);
        System.out.println("Вершина стека: " + stack.peek());
        System.out.println("Снять: " + stack.pop());
        System.out.println("Стек после 'снятия': " + stack);

        System.out.println("----------- Очистка стека ----------------");
        stack.clear();
        System.out.println("Стек начальный: " + stack);
        stack.push("A");
        stack.push("B");
        stack.push("C");
        System.out.println("Стек заполненный: " + stack);
        System.out.println("------------------------------");
        System.out.println("Вершина стека: " + stack.peek());
        stack.poll();
        System.out.println("Стек после манипуляции: " + stack);



    }
}
