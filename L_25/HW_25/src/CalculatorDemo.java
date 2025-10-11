
/**
 * **Задание:** Сравните интерфейс и абстрактный класс:
 * - Создайте интерфейс `Calculator` с методами для базовых операций
 * - Создайте абстрактный класс `AdvancedCalculator` с дополнительной функциональностью
 * - Создайте класс `ScientificCalculator`, использующий оба подхода
 * - Объясните в комментариях, почему выбран каждый подход
 */

import java.util.ArrayList;

public class CalculatorDemo {
    public static void main(String[] args) {
        System.out.println("=== Демонстрация работы системы калькуляторов ===\n");

        ScientificCalculator calculator = new ScientificCalculator(2);
        ScientificCalculator calculator2 = new ScientificCalculator("TestCalc1", 6);

        // Демонстрация базовых операций
        demonstrateBasicOperation(calculator);

        // Демонстрация расширенных операций
        demonstrateAdvancedOperation(calculator);

        // Демонстрация научных операций
        demonstrateScientificOperation(calculator);
        demonstrateScientificOperation(calculator2);

        // Демонстрация полиморфизма
        demonstrationPolymorphism(calculator);
    }

    private static void demonstrateBasicOperation(ScientificCalculator calc) {
        System.out.println("--- Базовые арифметические операции ---");
        double a = 15.7;
        double b = 4.5;

        System.out.println("a = " + a + ", b = " + b);
        System.out.println("Сложение: " + a + " + " + b + " = " +
                calc.formatResult(calc.add(a, b)));
        System.out.println("Вычитание: " + a + " - " + b + " = " +
                calc.formatResult(calc.subtract(a, b)));
        System.out.println("Умножение: " + a + " * " + b + " = " +
                calc.formatResult(calc.multiply(a, b)));
        System.out.println("Деление: " + a + " / " + b + " = " +
                calc.formatResult(calc.divide(a, b)));
        System.out.println();
    }

    private static void demonstrateAdvancedOperation(ScientificCalculator calc) {
        System.out.println("--- Расширенные операции ---");
        double base = 2.5;
        double exponent = 3;

        System.out.println("Возведение в степень: " + base + "^" + exponent + " = " +
                calc.formatResult(calc.power(base, exponent)));
        System.out.println();
    }

    private static void demonstrateScientificOperation(ScientificCalculator calc) {
        System.out.println("--- Научные операции ---");

        // Тригонометрические операции
        System.out.println("Тригонометрия:");
        System.out.println("  sin(30°) = " + calc.formatResult(calc.sin(30)));
        System.out.println("  cos(60°) = " + calc.formatResult(calc.cos(60)));
        System.out.println();

        // Логарифмы
        System.out.println("Логарифмы:");
        System.out.println("  log₁₀(100) = " + calc.formatResult(calc.log(100)));
        System.out.println("  ln(e) = " + calc.formatResult(calc.ln(Math.E)));

        // Другие операции
        System.out.println("Другие операции:");
        System.out.println("  √16 = " + calc.formatResult(calc.sqrt(16)));
        System.out.println("  |-7.5| = " + calc.formatResult(calc.abs(-7.5)));
        System.out.println("  5! = " + calc.factorial(5));

        System.out.println();
    }

    private static void demonstrationPolymorphism(ScientificCalculator calc) {
        System.out.println("--- Демонстрация полиморфизма ---");

        // Использование через интерфейс Calculator
        Calculator basicCal = calc;
        System.out.println("Через интерфейс Calculator: 10 + 5 = " + basicCal.add(10, 5));

        // Использование через абстрактный класс AdvancedCalculator
        AdvancedCalculator advancedCal = calc;
        System.out.println("Через абстрактный класс AdvancedCalculator: 2^8 = " + advancedCal.power(2, 8));

        // Использование через ScientificCalculator
        System.out.println("Через ScientificCalculator: cos(90°) = " + calc.formatResult(calc.cos(90)));

        System.out.println();
    }
}