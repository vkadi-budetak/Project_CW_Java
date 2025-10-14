import lessons.lesson_31.lesson.Box;

import java.util.Arrays;
import java.util.List;

public class BoxExample {
    public static void main(String[] args) {
        // Создаем коробку для строк
        lessons.lesson_31.lesson.Box<String> stringBox = new lessons.lesson_31.lesson.Box<>("Привет, мир!");
        stringBox.displayInfo();

        // Создаем коробку для чисел
        lessons.lesson_31.lesson.Box<Integer> integerBox = new lessons.lesson_31.lesson.Box<>(42);
        integerBox.displayInfo();

        // Создаем коробку для списков
        lessons.lesson_31.lesson.Box<List<String>> listBox = new lessons.lesson_31.lesson.Box<>(Arrays.asList(
                "Java", "Python", "C++"
        ));
        listBox.displayInfo();

        //
        System.out.println("\n=== Новое ===");
        lessons.lesson_31.lesson.Box<Integer> numberBox = lessons.lesson_31.lesson.Box.createBox(123);
        System.out.println("\nСодержимое numberBox: " + numberBox.getContent());

        lessons.lesson_31.lesson.Box<String> stringBox1 = lessons.lesson_31.lesson.Box.createBox("\nПривет, Дженерики!");
        System.out.println("Содержимое stringBox1: " + stringBox1.getContent());

        lessons.lesson_31.lesson.Box<Double> doubleBox = Box.createBox(3.14);
        System.out.println("\nСодержимое doubleBox: " + doubleBox.getContent());
    }
}
