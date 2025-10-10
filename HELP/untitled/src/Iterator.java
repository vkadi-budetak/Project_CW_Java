import java.util.ArrayList;

/*
public interface Iterator<E> {
boolean hasNext();    // Есть ли следующий элемент?
E next();            // Получить следующий элемент
void remove();       // Удалить текущий элемент (опционально)
}
*/

// CW 28

public class Iterator {
    public static void main(String[] args) {


        ArrayList<String> cities = new ArrayList<>();
        cities.add("Берлин");
        cities.add("Мюнхен");
        cities.add("Гамбург");
        cities.add("Кельн");
        cities.add("Франкфурт");

        System.out.println("=== Обход городов с помощью Iterator ===");

        // Получаем итератор
        java.util.Iterator<String> iterator = cities.iterator();

        // Обходим нашу коллекцию
        while (iterator.hasNext()) {
            String city = iterator.next();
            System.out.println("Город: " + city);
        }

        System.out.println("Всего городов: " + cities.size());

    }
}
