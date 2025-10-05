public class Main_ЦИКЛИ {
    public static void main(String[] args) {
        /// Використання ->> Цикл for
        for (int i = 0; i < 5; i++) {
            System.out.println(i); // Виведе ->> 01234
        }

        // reversed sequence
        for (int i = 4; i >= 0; i--) {
            System.out.println(i); // Виведе ->> 43210
        }

        // process only even numbers
        int sum = 0;
        for (int i = 2; i <= 10; i += 2) {   // перебираємо від 2 до 10
            sum += i;             // Виведе суму всіх парних
        }
        System.out.println("The sum is " + sum);
    }
}
