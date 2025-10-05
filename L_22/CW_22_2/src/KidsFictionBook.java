public class KidsFictionBook extends FictionBook{
    public int age;

    public KidsFictionBook() {
    }

    public KidsFictionBook(String author, String title, int pages,
                           int isbn, String genre, int age) {
        super(author, title, pages, isbn, genre);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return super.toString()+ " age: " +  age  ;
    }
}
