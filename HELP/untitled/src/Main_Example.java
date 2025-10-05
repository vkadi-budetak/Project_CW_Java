import java.util.Scanner;

public class Main_Example {
    public static void main(String[] args) {
        /// Використання ->> 01234
        int number = 0;
        while (number < 5) {
            System.out.println(number++);
        }
        /// Запрос у консолі і перевірка на do..while
        Scanner scanner = new Scanner(System.in);
        String password;
        // Execute the loop body first, then evaluate the condition
        do {
            System.out.println("Please enter your password:");
            password = scanner.nextLine();
        } while (password.length() < 8);

        System.out.println("Password accepted");
    }
}
