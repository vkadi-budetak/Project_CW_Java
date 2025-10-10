import java.util.ArrayList;

public class ShopDemo {
    public static void main(String[] args) {
        EducationBook book1 = new EducationBook("Математика для поступающих в ВУЗ.", "Сканави", 1978, 11.5);
        book1.setSubject("Математика");
        EarthSciencesBook book2 = new EarthSciencesBook(
                "Геология островов", "Иванов", 2025, 25
        );

        ArrayList<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);

        for (Book book : books) {
            //System.out.println(book);

        }

    }
}
