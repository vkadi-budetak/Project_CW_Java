import java.util.Objects;

public class Book implements Comparable<Book> {
    private String title;
    private String author;
    private int year;
    private int pages;

    /**
     * Создаю конструктор
     * @param title - название книги
     * @param author - автор
     * @param year - год издания
     * @param pages количество страниц
     */
    public Book(String title, String author, int year, int pages) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.pages = pages;
    }

    // Гетери
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public int getYear() {
        return year;
    }
    public int getPages() {
        return pages;
    }

    // Переопределяем equals() и hashCode()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book b = (Book) o;
        return year == b.year
                && pages == b.pages
                && Objects.equals(title, b.title)
                && Objects.equals(author, b.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, year, pages);
    }

    // Альтернативный вывод
    public void printAsList(Book[] books) {
        for (int i = 0; i < books.length; i++) {
            System.out.printf("%d) %s%n", i + 1, books[i]); // books[i].toString()
        }
    }

    // Переопределяем для удобного вывода
    @Override
    public String toString() {
        return String.format("Book{title='%s', author='%s', year=%d, pages=%d}",
                title, author, year, pages);
    }

    /**
     * Упорядочивание книг по году издания (от старых к новым)
     */
    @Override
    public int compareTo(Book otherBook) {
        return Integer.compare(this.year, otherBook.year);
    }
}


