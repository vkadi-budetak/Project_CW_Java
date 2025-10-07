import java.util.ArrayList;

public class AccessingElements {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Берлин");
        cities.add("Париж");
        cities.add("Лондон");

        System.out.println("Город: " + cities);
        // Получения элемента по интексу
        String firstCity = cities.get(0); // cities.getFirst() ПОЛУЧИТЬ
        String lastCity = cities.getLast(); // cities.get(cities.size()-1)

        System.out.println("Первый горрод: " + firstCity);
        System.out.println("Последний горрод: " + lastCity);

        // Изминения элемента по индексу
        String oldLastSity =  cities.set(cities.size() -1, "Прага"); // ЗАМЕНИТЬ
        System.out.println("Заменили " + oldLastSity + " на " + cities.getLast());
        System.out.println("Город: " + cities);
        System.out.println("Список пуст? " + cities.isEmpty());

    }
}
