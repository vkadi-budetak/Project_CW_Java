public class Book // extends Object
{
    private String author;
    private String title;
    private int pages;
    private int isbn;

    public Book() {
    }

    public Book(String author, String title, int pages, int isbn) {
//        super();
        this.author = author;
        this.title = title;
        this.setPages(pages);
        setIsbn(isbn);
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        if(pages>=0)
            this.pages = pages;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        if (isbn>0)
            this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", pages=" + pages +
                ", isbn=" + isbn +
                '}';
    }
}

