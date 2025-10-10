import java.util.ArrayList;

public interface Operation {
    String TEXT = "Благодарим за покупку!";
    double MIN_SUM_FOR_BONUS = 100.0;

    void sellBook(ArrayList<Book> books, String currentDate);
    void returnBook(ArrayList<Book> books);

    default String bonus(double sum, String date) {
        if (sum >= MIN_SUM_FOR_BONUS) {
            return "Вам положен бонус";
        } else {
            if (date.equals("BIRTHDAY")) {
                bonusPlus("BIRTHDAY");
            }
        }

        return TEXT;
    }

    private String bonusPlus(String dateBirthday) {
        return "Вам положен супер-бонус";
    }
}
