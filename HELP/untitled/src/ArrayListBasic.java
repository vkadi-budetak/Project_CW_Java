import java.util.ArrayList;
import java.util.Arrays;

//Смотри 28 урок

public class ArrayListBasic {
    public static void main(String[] args) {  // ArrayList - это коробка в которую мы можем поместить все наши массивы
        //Создание пустого ArrayList: массив
        String[] texts = new String[10];
        ArrayList<String> fruits = new ArrayList<>();

        // Создание с начальной емкостью
        ArrayList<Integer> numbers = new ArrayList<>(10);

        // Создание из другой КОЛЛЕКЦИИ
        ArrayList<String> colors = new ArrayList<>(
                Arrays.asList("красный", "синий", "зеленый")
        );

        System.out.println("Цвета: " + colors);

        System.out.println("== Вывод содердимого динамического списка ==");
        for (String color : colors) {
            System.out.println(color);
        }

    }
}
