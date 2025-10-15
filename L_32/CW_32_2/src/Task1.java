import java.util.List;
import java.util.ListIterator;

public class Task1 {
    public static void main(String[] args) {
        List<String> list = List.of("nam1", "nam2","nam3","nam4","nam5","nam6");
        // Создаю метод
        printRevers(list);
    }

    private static void printRevers(List<String> list) {
        ListIterator<String> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }
    }
}

/**
 * Дан List строк содержащий имена пользователей.
 * Необходимо написать метод, который выводит его на экран
 * в обратном порядке,
 * начиная с последнего имени.
 */