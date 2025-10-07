import java.util.ArrayList;

public class AddingElements {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();

        // Добавляем в конце списка
        animals.add("Кот");
        animals.add("Собака");
        animals.add("Попугай");

        System.out.println("Все животные " + animals);

        // Добавляем по индексу(сдвигает остальные элементы
        animals.add(2, "Хомяк");
        System.out.println("\nВсе животные " + animals);

        // Добавляем всех элементов из другой коллекции
        ArrayList<String> moreAnimals = new ArrayList<>();
        animals.add("Рыбка");
        animals.add("Черепаха");
        animals.add("Ящерица");

        animals.addAll(moreAnimals);
        System.out.println("\nВсе животные " + animals);

        // Добавляем коллекции по индексу
        ArrayList<String> birds = new ArrayList<>();
        birds.add("Воробей");
        birds.add("Синица");

        animals.addAll(2, birds);
        System.out.println("\nВсе животные " + animals);
        System.out.println("Размер списка: " + animals.size()); // Количество выводим



    }
}
