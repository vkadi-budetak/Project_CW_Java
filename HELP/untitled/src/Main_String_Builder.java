public class Main_String_Builder {

    public static void main(String[] args) { // ЗМІННІ РЯДКИ

        String word1 = "Hello";
        String word2 = "World";

        // Creating a StringBuilder instance
        StringBuilder builder = new StringBuilder(word1);

        // Key StringBuilder methods
        builder.append(" ").append(word2).append("!");

        System.out.println(builder);

        builder.reverse();
        System.out.println(builder);

        String[] fruitsArray = {"Banana", "Apple", "Lemon", "Watermelon", "Pear"};

        // Creating a string inside a loop
        StringBuilder fruits = new StringBuilder();

        for (String fruit : fruitsArray) {
            fruits.append(fruit).append(":").append(fruit.length()).append("  ");
        }

        System.out.println(fruits);
    }
}
