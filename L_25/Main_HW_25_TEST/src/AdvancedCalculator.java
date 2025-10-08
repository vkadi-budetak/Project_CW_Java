import java.util.Scanner;

/**
 * Абстрактный класс AdvancedCalculator расширяет функциональность базового калькулятора
 *
 * Зачем создан абстрактный класс:
 * - Предоставляет общую реализацию базовых операций для всех наследников.
 * - Содержит общее состояние (поля), которое наследуют все потомки.
 * - Определяет дополнительную функциональность (форматирование, возведение в степень)
 * - Содержит абстрактные методы, которые должны быть реализованы в конкретных классах
 */
public abstract class AdvancedCalculator implements Calculator {
    protected String calculatorName;    // Базовое имя
    protected int precision;            // точность (кол-во знаков после запятой)

    /**
     * Конструктор абстрактного класса
     * @param calculatorName - имя калькулятора
     * @param precision - точность вычислений (кол-во знаков после запятой)
     */
    public AdvancedCalculator(String calculatorName, int precision) {
        this.calculatorName = calculatorName;
        this.precision = precision;
    }

    // Реализация базовых операций интерфейса Calculator

    @Override
    public double add(double a, double b) {
        return a + b;
    }

    @Override
    public double subtract(double a, double b) {
        return a - b;
    }

    @Override
    public double multiply(double a, double b) {
        return a * b;
    }

    @Override
    public double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Деление на ноль недопустимо!");
            return 0;
        }
        return a / b;
    }

//    @Override
//    public double divide(double a, double b) throws ArithmeticException {
//        if (b == 0) {
//            throw new ArithmeticException("Деление на ноль недопустимо!");
//        }
//        return a / b;
//    }

    // Дополнительные возможности

    /**
     * Дополнительная операция - возведение в степень
     * Конкретная реализация в абстрактном классе, доступная всем наследникам
     * @param base - основа
     * @param exponent - степень
     * @return - результат возведения в степень
     */
    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    /**
     * Форматирование результата с заданной точностью
     * Общая функциональность для всех калькуляторов
     * @param result - число, для которого будет выполнено форматирование
     * @return - результат форматирования
     */
    public String formatResult(double result) {
        return String.format("%." + precision + "f", result);
    }

    public String getCalculatorInfo() {
        return "Калькулятор: " + calculatorName + " (точность: " + precision + " знаков)";
    }

    /**
     * Абстрактный метод для получения списка доступных операций
     * Каждый конкретный калькулятор должен определить свои возможности
     * @return - список доступных операций
     */
    public abstract String[] getAvailableOperation();

    /**
     * Абстрактный метод для выполнения специфических операций калькулятора
     * Демонстрация: как абстрактный класс может определять "заготовки"
     * для будущих реализаций
     * @param operation - тип операции
     * @param args - аргументы для передачи в операцию
     * @return - результат выполнения операции
     */
    public abstract double performSpecialOperation(String operation, double... args);
}

