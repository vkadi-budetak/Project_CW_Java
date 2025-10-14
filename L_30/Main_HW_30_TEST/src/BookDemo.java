import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BookDemo {
    public static void main(String[] args) {
        // Создаем массив книг
        Book[] books = {
                new Book("Война и мир", "Лев Толстой", 1869, 1225),
                new Book("1984", "Джордж Оруэлл", 1949, 328),
                new Book("Мастер и Маргарита", "Михаил Булгаков", 1967, 384),
                new Book("Гарри Поттер", "Дж.К. Роулинг", 1997, 223),
                new Book("Братья Карамазовы", "Федор Достоевский", 1866, 671)
        };

        System.out.println("=== Книги до сортировки: ===");
        printInfo(books);

        System.out.println("=== Книги после сортировки: ===");
        Arrays.sort(books);
        //Collections.sort(books);
        printInfo(books);

    }

    public static void printInfo(Book[] booksList) {
        for (Book book : booksList) {
            System.out.println(book);
        }
    }
}