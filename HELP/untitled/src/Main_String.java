import java.util.Arrays;

public class Main_String {

    public static void main(String[] args) {

        // Creating a string using a string literal
        String text = "Hello World!";

        // Key String methods
        System.out.println(text.length());

        System.out.println(text.startsWith("H"));
        System.out.println(text.startsWith("h"));

        String text1 = "Hello World";

        System.out.println(text.equals(text1));

        System.out.println(text.toLowerCase());
        System.out.println(text.toUpperCase());

        char symbol = text.charAt(3);
        System.out.println(symbol);

        System.out.println(text.contains("World"));
        System.out.println(text.contains("Word"));

        System.out.println(text.isEmpty());

        String spaces = "   ";
        System.out.println(spaces.isEmpty());
        System.out.println(spaces.isBlank());

        spaces = spaces.replace(" ", "1");
        System.out.println(spaces);

        String word = text.substring(6, 11);
        System.out.println(word);

        String fruits = "Banana, Apple, Lemon";
        String[] fruitsArray = fruits.split(", ");
        System.out.println(Arrays.toString(fruitsArray));
    }
}
