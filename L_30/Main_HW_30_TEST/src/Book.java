import java.util.Objects;

public class Book implements  Comparable<Book> {
    private String title;
    private String author;
    private int year;
    private int pages;

    public Book(String title, String author, int year, int pages) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.pages = pages;
    }

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

    /**
     * Реализация метода compareTo для сортировки по году издания
     * @param other - другая книга для сравнения
     * @return - отрицательное число, если эта книга "старше",
     *           положительно число - если книга "новее",
     *           0 (ноль) - если книги равны по годам
     */
    @Override
    public int compareTo(Book other) {
        return Integer.compare(this.year, other.year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, year, pages);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Book compareBook = (Book) obj;
        return year == compareBook.year &&
                pages == compareBook.pages &&
                Objects.equals(title, compareBook.title) &&
                Objects.equals(author, compareBook.author);
    }

    @Override
    public String toString() {
        return String.format("📖 \"%s\" - %s (%d г., %d стр.)",
                title, author, year, pages);
    }
}

