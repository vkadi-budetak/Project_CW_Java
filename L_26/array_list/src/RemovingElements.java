import java.util.ArrayList;

public class RemovingElements {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("яблоко");
        fruits.add("банан");
        fruits.add("апельсин");
        fruits.add("груша");
        fruits.add("банан"); // Дубликат

        System.out.println("Исходный список: " + fruits);

        // Удаление по индексу
        String removedFruit = fruits.remove(0); // Удаляем "яблоко"
        System.out.println("Удалили: " + removedFruit);
        System.out.println("После удаления по индексу: " + fruits);

        // Удаление по значению (удаляет первое вхождение)
        boolean removed = fruits.remove("банан"); // Удаляем первый "банан"
        System.out.println("Удаление банана успешно? " + (removed ? "да" : "нет"));
        System.out.println("После удаления банана: " + fruits);

        // Удаление всех элементов из другой коллекции
        ArrayList<String> toRemove = new ArrayList<>();
        toRemove.add("апельсин");
        toRemove.add("груша");

        boolean removedAll = fruits.removeAll(toRemove);
        System.out.println("Удалили все из списка? " + (removedAll ? "да" : "нет"));
        System.out.println("После удаления коллекции: " + fruits);

        // Добавим элементы обратно для демонстрации
        fruits.add("киви");
        fruits.add("манго");
        fruits.add("ананас");

        // Удаление всех элементов, кроме указанных
        ArrayList<String> toKeep = new ArrayList<>();
        toKeep.add("банан");
        toKeep.add("киви");

        fruits.retainAll(toKeep); // Оставляем только банан и киви
        System.out.println("После retainAll: " + fruits);

        // Очистка всего списка
        fruits.clear();
        System.out.println("После clear: " + fruits);
        System.out.println("Список пуст? " + (fruits.isEmpty() ? "да" : "нет"));
    }
}