import java.util.Arrays;
import java.util.List;

public class BoxExample {
    public static void main(String[] args) {
        // Создаем коробку для строк
        Box<String> stringBox = new Box<>("Привет, мир");
        stringBox.displayInfo();

        // Создаем коробку для чисел
        Box<Integer> integerBox = new Box<>(42);
        integerBox.displayInfo();

        // Создаем коробку для списков
        Box<List<String>> listBox = new Box<>(Arrays.asList(
                "Java", "Python", "C++"
        ));
        listBox.displayInfo();

        //
        System.out.println("\n=== Новое ===");
        Box<Integer> numberBox = Box.createBox(123);
        System.out.println("\nСодержимое numberBox: " + numberBox.getContent());

        Box<String> stringBox1 = Box.createBox("\nПривет, Дженерики!");
        System.out.println("Содержимое stringBox1: " + stringBox1.getContent());

        Box<Double> doubleBox = Box.createBox(3.14);
        System.out.println("\nСодержимое doubleBox: " + doubleBox.getContent());


    }
}
