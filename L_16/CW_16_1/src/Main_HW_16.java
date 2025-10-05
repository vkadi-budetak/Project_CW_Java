import java.util.Scanner;

public class Main_HW_16 {
    public static void main(String[] args) {
        double num1, num2, result;
        char action;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        String answer = scanner.nextLine().trim();
        num1 = Double.parseDouble(answer);
        System.out.println("Enter second number:");
        answer = scanner.nextLine().trim();
        num2 = Double.parseDouble(answer);
        System.out.println("Enter action (+ - * /):");
        answer = scanner.nextLine().trim();
        action = answer.charAt(0);

        result = calculator(num1, num2, action);
        System.out.printf("Switch-classic => %.2f %c %.2f = %.2f%n", num1, action, num2, result);

        result = calculator2(num1, num2, action);
        System.out.printf("Switch-arrow (->) => %.2f %c %.2f = %.2f%n", num1, action, num2, result);

    }

    private static double calculator2(double num1, double num2, char action) {
        return switch (action) {
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*' -> num1 * num2;
            case '/' -> num2 != 0 ? num1 / num2 : 0;
            default -> 0;  //  yield Double.NaN;
        };
    }


    private static double calculator(double num1, double num2, char action) {
        switch (action) {
            case '+': {
                return num1 + num2;
            }
            case '-': {
                return num1 - num2;
            }
            case '*': {
                return num1 * num2;
            }
            case '/': {
                return num2 != 0 ? num1 / num2 : 0;
            }
            default:
                System.out.println("Action not valid: " + action);
                return 0;
        }
    }
}
/*

# SWITCH: калькулятор с double6

## ➕ Задание
Реализуйте калькулятор над числами `double` с операциями `+ - * /`.
Оператор выбирается через `switch`. Выведите результат.

 */
