import java.util.ArrayList;

public class LibrarySystem {
    public static void main(String[] args) {
        // Создаем динамический массив для хранения книг
        ArrayList<Book> library = new ArrayList<>();

        // Добавляем книги в нашу библиотеку
        library.add(new Book("Война и мир", "Лев Толстой", 1869));
        library.add(new Book("1984", "Джордж Оруэлл", 1949));
        library.add(new Book("Гарри Поттер", "Джоан Роулинг", 1997));
        library.add(new Book("Мастер и Маргарита", "Михаил Булгаков", 1967));
        library.add(new Book("1984", "Джордж Оруэлл", 1949));
        library.add(new Book("Убить пересмешника", "Харпер Ли", 1960));
        library.add(new Book("Хоббит", "Дж. Р. Р. Толкин", 1937));
        library.add(new Book("Гордость и предубеждение", "Джейн Остин", 1813));
        library.add(new Book("Над пропастью во ржи", "Дж. Д. Сэлинджер", 1951));
        library.add(new Book("451° по Фаренгейту", "Рэй Брэдбери", 1953));
        library.add(new Book("Моби Дик", "Герман Мелвилл", 1851));
        library.add(new Book("Война и мир", "Лев Толстой", 1869));
        library.add(new Book("Великий Гэтсби", "Фрэнсис Скотт Фицджеральд", 1925));
        library.add(new Book("О дивный новый мир", "Олдос Хаксли", 1932));

        printInfo(library);

        // Поиск книги по автору
        String searchAuthor = "Лев Толстой";
        System.out.println("Поиск книги автора '" + searchAuthor + "':");
        boolean isFound = false;

        for (Book book: library) {
            if (book.getAuthor().contains(searchAuthor)) {
                System.out.println("Найдена: " + book);
                isFound = true;
            }
        }

        if (!isFound) {
            System.out.println("Книги автора " + searchAuthor + " не найдены");
        }

        // Поиск книги по названию
        String searchTitle = "1984";
        System.out.println("Поиск книги '" + searchTitle + "':");
        int bookIndex = -1;

        for (int i = 0; i < library.size(); i++) {
            if (library.get(i).getTitle().equals(searchTitle)) {
                bookIndex = i;
                break;
            }
        }

        if (bookIndex != -1) {
            System.out.println("Книга найдена на позиции " + (bookIndex + 1) +
                    ": " + library.get(bookIndex));
        } else {
            System.out.println("Книга '" + searchTitle + "не найдена.");
        }

        // Удаление книги
        Book bookToRemove = new Book("Хоббит", "Дж. Р. Р. Толкин", 1937);
        System.out.println("Удаляем книгу '" + bookToRemove.getTitle() + "'");
        boolean removed = library.remove(bookToRemove);

        if (removed) {
            System.out.println("Книга успешно удалена!");
            System.out.println("Всего книг в библиотеке: " + library.size());
        } else {
            System.out.println("Книга не найдена для удаления");
        }

        printInfo(library);

    }
    public static void printInfo(ArrayList<Book> books) {
        System.out.println("Всего книг в библиотеке: " + books.size());
        System.out.println("\nСписок всех книг: ");
        for (int i = 0; i < books.size(); i++) {
            System.out.println((i + 1) + ". " + books.get(i));
        }
    }
}

