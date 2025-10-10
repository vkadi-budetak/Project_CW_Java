import java.util.ArrayList;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Длина (емкость) списка: " + numbers.size());
        for (int i = 1; i <= 50; i++) {
            numbers.add(i);
        }
        System.out.println("Список чисел: " + numbers);
        System.out.println("Длина (емкость) списка: " + numbers.size());

        /*
        // Недопустимый способ
        for (Integer num : numbers) {
            if (num % 2 == 0) {
                numbers.remove(num);
            }
        }
        System.out.println("=== После манипуляции со списком ===");
        System.out.println("Список чисел: " + numbers);
*/
        for (int i = 0; i < numbers.size() - 1; i++) {
            Integer currentNumber = numbers.get(i);
            if (numbers.get(i) % 2 == 0) {
                numbers.remove(currentNumber);
            }
        }
        System.out.println("=== После манипуляции со списком ===");
        System.out.println("Список чисел: " + numbers);
        System.out.println("Длина (емкость) списка: " + numbers.size());

        numbers.add(2, null);
        System.out.println("=== После манипуляции со списком ===");
        System.out.println("Список чисел: " + numbers);
        System.out.println("Длина (емкость) списка: " + numbers.size());
    }
}
