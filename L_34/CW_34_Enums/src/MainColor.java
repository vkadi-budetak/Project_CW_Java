import java.awt.color.ColorSpace;
import java.util.Arrays;

/**
 * Це підвид класа Enums
 * це спец клас який використовується для деяких колекцій констант. Тобто його використовують коли
 * говорять про дні тижня(яких тільки 7), місяці(якийх тільки 12 в році)....
 */

public class MainColor {
    public static void main(String[] args) {
        System.out.println(Color.RED); // - це Enums
        // Створюю метод
        drawColor(Color.RED);

        // Створюю масив кольорів
        Color[] value = Color.values();  // values() - повертає масив
        System.out.println(Arrays.toString(value));

        // Color.RED -> "RED" - Тут я отримую рядок(STRING)
        String colorName = Color.RED.name();
        System.out.println(colorName);
        System.out.println(colorName.toLowerCase());

        // "BLUE" -> Color.BLUE
        Color myColor = Color.valueOf("BLUE"); // valueOf - шукає наявність і повертає Enums
        System.out.println(myColor);

        // Працюю із Color2
        drawColor(Color2.GREEN);

        // Працюю із Color3
        Color3.BLACK.print();


    }
    // Виводжу на друк Color2
    private static void drawColor(Color2 color) {
        System.out.println(color.getTitle());
        System.out.println(color.getCode());
    }

    // Виводжу на друк
    private static void drawColor(Color color) {
        System.out.println(color);
    }

}