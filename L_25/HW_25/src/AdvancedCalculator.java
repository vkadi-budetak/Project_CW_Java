/**
 * Создаем абстрактный клас AdvancedCalculator и в нем производим всю общую реализацию
 */
public abstract class AdvancedCalculator implements Calculator {
    private double res = 0;

    @Override
    public double add(double a, double b) {
        return res = a + b;
    }

    @Override
    public double subtract(double a, double b) {
        return res = a - b;
    }

    @Override
    public double multiply(double a, double b) {
        return res = a * b;
    }

    @Override
    public double divide(double a, double b) {
        if (b == 0.0) throw new IllegalArgumentException("Division by zero");
        return res = a / b;
    }
}
