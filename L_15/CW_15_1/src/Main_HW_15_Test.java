import java.util.Scanner;

public class Main_HW_15_Test {
    public static void main(String[] args) {
/// Задача №1
        System.out.println("=============== 1 ==================");
        double flask1 = 75., flask2 = 20.5;
        System.out.println("Result: " +
                flask1 + "  " + flask2 + "  " + is_valid(flask1, flask2));
        System.out.println("Result: " +
                flask1 + "  " + flask2 + "  " +
                (is_valid(flask1, flask2) ? "VALID" : "NOT VALID"));
/// Задача №1
        System.out.println("================ 2 =====================");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер месяца 1...12:");
        int number = scanner.nextInt();
        printMonth1(number);
        System.out.println(number + " -> " + nameMonth2(number));
/// Задача №3
        System.out.println("================= 3 ==================");
        int num1 = 5, num2 = 7, num3 = 11;
        int resMax;
        System.out.println("============== 3.1 ==================");
        resMax = num1;
        if (num2 > resMax) resMax = num2;
        if (num3 > resMax) resMax = num3;
        System.out.printf("%d  %d  %d  Max= %d\n", num1, num2, num3, resMax);

        System.out.println("============== 3.2 ==================");
        resMax = num1;
        resMax = num2 > resMax ? num2 : resMax;
        resMax = num3 > resMax ? num3 : resMax;
        System.out.printf("%d  %d  %d  Max= %d\n", num1, num2, num3, resMax);

        System.out.println("============== 3.3 ==================");
        resMax = num1;
        resMax = Math.max(resMax, num2);
        resMax = Math.max(resMax, num3);
        System.out.printf("%d  %d  %d  Max= %d\n", num1, num2, num3, resMax);

        System.out.println("============== 3.4 ==================");
        resMax = num1;
        resMax = Math.max(resMax, Math.max(num2, num3));
        System.out.printf("%d  %d  %d  Max= %d\n", num1, num2, num3, resMax);
    }

    private static String nameMonth2(int number) {
        String name = switch (number) {
            case 1 -> "Январь";
            case 2 -> "Февраль";
            case 3 -> "Март";
            case 4 -> "Апрель";
            case 5 -> "Май";
            case 6 -> "Июнь";
            case 7 -> "Июль";
            case 8 -> "Август";
            case 9 -> "Сентябрь";
            case 10 -> "Октябрь";
            case 11 -> "Ноябрь";
            case 12 -> "Декабрь";
            default -> "Error " + number;
        };
        return name;
    }

    private static void printMonth1(int number) {
        switch (number) {
            case 1:
                System.out.println(number + " --->>> " + "Январь");
                break;
            case 2:
                System.out.println(number + " --->>> " + "Февраль");
                break;
            case 3:
                System.out.println(number + " --->>> " + "Март");
                break;
            case 4:
                System.out.println(number + " --->>> " + "Апрель");
                break;
            case 5:
                System.out.println(number + " --->>> " + "Май");
                break;
            case 6:
                System.out.println(number + " --->>> " + "Июнь");
                break;
            case 7:
                System.out.println(number + " --->>> " + "Июль");
                break;
            case 8:
                System.out.println(number + " --->>> " + "Август");
                break;
            case 9:
                System.out.println(number + " --->>> " + "Сентябрь");
                break;
            case 10:
                System.out.println(number + " --->>> " + "Октябрь");
                break;
            case 11:
                System.out.println(number + " --->>> " + "Ноябрь");
                break;
            case 12:
                System.out.println(number + " --->>> " + "Декабрь");
                break;
            default:
                System.out.println("Number not valid " + number);
        }


    }

    private static boolean is_valid(double flask1, double flask2) {
        boolean result = (flask1 >= 20 && flask1 <= 40 && flask2 > 75) ||
                (flask2 >= 20 && flask2 <= 40 && flask1 > 75);
        return result;
    }
}

/*
1.Даны температуры в двух колбах: `flask1` и `flask2`.
Прибор работает корректно, если **в одной** колбе температура
в диапазоне `[20; 40]`, а **в другой** — строго больше `75`.
Определите корректность работы прибора и выведите результат.
2.
Попросите пользователя (через переменную или через консоль) ввести номер месяца (1–12) и
выведите его название с помощью `switch`.
3.
Введите три целых числа (через переменные или через консоль).
Выведите **наибольшее** двумя способами:
1) с использованием `if`,
2) с использованием тернарного оператора `?:`.

 */
