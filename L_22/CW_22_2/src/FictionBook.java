public class FictionBook extends Book {
    /// наследование !!!!
    private String genre;

    public FictionBook() {
    }

    public FictionBook(String author, String title,
                       int pages, int isbn, String genre) {
        super(author, title, pages, isbn);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return super.toString() + "genre: " + genre;
    }


}
