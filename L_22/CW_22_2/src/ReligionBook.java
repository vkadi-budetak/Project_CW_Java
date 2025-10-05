public class ReligionBook extends Book {
    private String religion;

    public ReligionBook() {
    }

    public ReligionBook(String author, String title, int pages,
                        int isbn, String religion) {
        super(author, title, pages, isbn);
        this.religion = religion;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    @Override
    public String toString() {
        return super.toString()+  "religion: " + religion  ;
    }
}
