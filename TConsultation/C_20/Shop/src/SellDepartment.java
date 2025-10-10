import java.util.ArrayList;

public class SellDepartment {
    String currentDay;

    @Override
    public void sellBook(ArrayList<Book> books, String currentDate) {
        for (Book book : books) {
            System.out.println("Книга " + book.getAuthor() + " оплачена");
            System.out.println("Книга " + book.getAuthor() + " получена покупателем.");
        }

        bonus(totalSumBooks(books), currentDay);

    }

    @Override
    public void returnBook(ArrayList<Book> books) {
        System.out.println("Произведен возврат книги");
        System.out.println("Произведен возврат оплаты покупателю");
    }

    private double totalSumBooks(ArrayList<Book> books) {
        double totalCost = 0;
        for (Book book : books) {
            totalCost += book.getPrice();
        }
        return totalCost;
    }
}