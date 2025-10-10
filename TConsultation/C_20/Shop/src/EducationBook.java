public class EducationBook extends Book {
    String subject;

    public EducationBook(String title, String author, int year, double price) {
        super(title, author, year, price);
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "EducationBook{} " + super.toString();
    }
}