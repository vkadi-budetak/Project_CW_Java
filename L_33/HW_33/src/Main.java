import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("==== AUTORIA ====");
        System.out.println("Добавте следующую информацию");
        System.out.print("Введите имя владельца: ");
        String owner = scanner.nextLine().trim();

        System.out.print("Введите объем двигателя (в литрах): ");
        double volume = scanner.nextDouble();

        System.out.print("Введите мощность двигателя (в л.с.): ");
        double power = scanner.nextDouble();

        System.out.print("Введите номер страховки: ");
        int numberInsurance = scanner.nextInt();


        // Создаю первое авто
        Car c1 = new Car.Builder("Ford", 2015, "Kuga", "white")
                .owner(owner)
                .volume(volume)
                .power(power)
                .numberInsurance(numberInsurance)
                .build();
        System.out.println(c1);

        scanner.close();
    }
}

/**
 * *
 *
 * HW_33_TEXT
 * С использованием патерна Билдер решить следующую задачу
 * Для программы регистрации автомобилей предусмотреть
 * создание инстансов Car с набором обязательных полей:
 * String plate
 * int year
 * String model
 * String color
 *
 * и необязательные поля
 * String owner
 * double volume
 * double power
 * int numberInsurance
 *
 * Ввод обязательных полей организовать в мэйне,
 * а необязательные поля запросить с консоли в
 * заполняльщиках с соответсвующей проверкой на адекватность.
 *
 * Породить три инстанса, уложить их в лист,
 * отсортировать их по номеру регистрации
 * и вывести на печать отсортированный список
 *  */

