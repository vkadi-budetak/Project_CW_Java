public class EducationBook extends Book{
    private String subject;

    public EducationBook() {
    }

    public EducationBook(String author, String title,
                         int pages, int isbn, String subject) {
        super(author, title, pages, isbn);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return    super.toString()+  subject  ;
    }

}
