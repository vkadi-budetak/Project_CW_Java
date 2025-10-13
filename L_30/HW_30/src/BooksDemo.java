import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BooksDemo {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("Мастер и Маргарита", "Михаил Булгаков", 1967, 480),
                new Book("Преступление и наказание", "Фёдор Достоевский", 1866, 672),
                new Book("Три мушкетёра", "Александр Дюма", 1844, 752),
                new Book("Тарас Бульба", "Николай Гоголь", 1842, 240),
                new Book("Маленький принц", "Антуан де Сент-Экзюпери", 1943, 96)
        );

        // До сортировки
        System.out.println("\n=== До сортировки ===");
        printAsList(books);
//        System.out.println("Список книг: \n" + books);

        // Сортировка
        Collections.sort(books);

        // После сортировки
        System.out.println("\n=== После сортировки ===");
        printAsList(books);
//        System.out.println("Список книг: \n" + books);


    }


    private static void printAsList(List<Book> books) {
        for (int i = 0; i < books.size(); i++) {
            System.out.printf("%d) %s%n", i + 1, books.get(i));
        }
    }
}

/**
 * Реализация Comparable для класса Book
 * 🎯 Условие:
 * Создайте класс Book с полями:
 * <p>
 * title (String) - название книги
 * author (String) - автор
 * year (int) - год издания
 * pages (int) - количество страниц
 * Требования:
 * <p>
 * Реализуйте интерфейс Comparable<Book> для сортировки по году издания (от старых к новым)
 * Переопределите методы equals() и hashCode()
 * Переопределите метод toString() для красивого вывода
 * Создайте массив из 5 книг и отсортируйте его с помощью Arrays.sort()
 * Выведите результат до и после сортировки
 * 💡 Подсказка:
 * Используйте Integer.compare(this.year, other.year) для сравнения годов
 * Не забудьте про контракт compareTo() - он должен быть согласован с equals()
 */