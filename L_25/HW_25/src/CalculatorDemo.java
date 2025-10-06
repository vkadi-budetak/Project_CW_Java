/**
 * **Задание:** Сравните интерфейс и абстрактный класс:
 * - Создайте интерфейс `Calculator` с методами для базовых операций
 * - Создайте абстрактный класс `AdvancedCalculator` с дополнительной функциональностью
 * - Создайте класс `ScientificCalculator`, использующий оба подхода
 * - Объясните в комментариях, почему выбран каждый подход
 */
public class CalculatorDemo {
    public static void main(String[] args) {
        ScientificCalculator sci = new ScientificCalculator();

        Calculator calc = sci;
        System.out.println("10.2 + 2.3 = " + calc.add(10.2, 2.3));
        System.out.println("10 - 4    = " + calc.subtract(10, 4));
        System.out.println("3 * 5     = " + calc.multiply(3, 5));
        System.out.println("9 / 3     = " + calc.divide(9, 0));



    }
}