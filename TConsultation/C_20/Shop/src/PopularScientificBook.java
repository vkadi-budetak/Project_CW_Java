public class PopularScientificBook extends Book {
    protected String publisher;

    public PopularScientificBook(String title, String author, int year, double price) {
        super(title, author, year, price);
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String genre) {
        this.publisher = genre;
    }
}
