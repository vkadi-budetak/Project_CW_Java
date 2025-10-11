public class ScientificCalculator extends AdvancedCalculator {
    /**
     * Конструктор абстрактного класса
     *
     * @param calculatorName - имя калькулятора
     * @param precision      - точность вычислений (кол-во знаков после запятой)
     */
    public ScientificCalculator(String calculatorName, int precision) {
        super(calculatorName, precision);
    }

    /**
     * Конструктор по умолчанию
     */
    public ScientificCalculator() {
        super("Научный калькулятор", 4);
    }

    /**
     * Конструктор с настраиваемой точностью
     * @param precision - точность (кол-во знаков после запятой)
     */
    public ScientificCalculator(int precision) {
        super("Научный калькулятор", precision);
    }

    /**
     * Реализация абстрактного метода
     * @return - список доступных операций
     */
    @Override
    public String[] getAvailableOperation() {
        return new String[]{
                "add", "subtract", "multiply", "divide", "power",
                "sin", "cos", "tan", "log", "ln", "sqrt", "abs"
        };
    }

    /**
     * Реализация абстрактного метода для выполнения специфических операций
     * @param operation - тип операции
     * @param args - аргументы для передачи в операцию
     * @return - результат выполнения операции
     */
    @Override
    public double performSpecialOperation(String operation, double... args) {
        if (args.length == 0) {
            System.out.println("Необходимо передать хотя бы один аргумент");
            return -1;
        }

        switch (operation.toLowerCase()) {
            case "sin":
                double result = Math.sin(Math.toRadians(args[0]));
                // Имитация логирования
                //System.out.println("Произведена операция '" + operation + "': результат = " + result);
                return result;
            case "cos":
                return Math.cos(Math.toRadians(args[0]));
            case "tan":
                return Math.tan(Math.toRadians(args[0]));
            case "log":
                if (args[0] <= 0) {
                    System.out.println("Логарифм от неположительного числа не определен");
                    return -1;
                }
                return Math.log10(args[0]);
            case "ln":
                if (args[0] <= 0) {
                    System.out.println("Натуральный логарифм от неположительного числа не определен");
                    return -1;
                }
                return Math.log(args[0]);
            case "sqrt":
                if (args[0] < 0) {
                    System.out.println("Квадратный корень из отрицательного числа не определен в действительных числах");
                    return -1;
                }
                return Math.sqrt(args[0]);
            case "abs":
                return Math.abs(args[0]);
            default:
                System.out.println("Операция '" + operation + "' не поддерживается");
                return -1;
        }
    }

    // Дополнительные научные операции с более удобным интерфейсом

    /**
     * Реализация операции вычисления синуса по градусам
     * @param degrees - градусы
     * @return - синус по градусам
     */
    public double sin(double degrees) {
        return performSpecialOperation("sin", degrees);
    }

    /**
     * Реализация операции вычисления косинуса по градусам
     * @param degrees - градусы
     * @return - косинус по градусам
     */
    public double cos(double degrees) {
        return performSpecialOperation("cos", degrees);
    }

    /**
     * Тангенс угла в градусах
     */
    public double tan(double degrees) {
        return performSpecialOperation("tan", degrees);
    }

    /**
     * Десятичный логарифм
     */
    public double log(double value) {
        return performSpecialOperation("log", value);
    }

    /**
     * Натуральный логарифм
     */
    public double ln(double value) {
        return performSpecialOperation("ln", value);
    }

    /**
     * Квадратный корень
     */
    public double sqrt(double value) {
        return performSpecialOperation("sqrt", value);
    }

    /**
     * Модуль числа
     */
    public double abs(double value) {
        return performSpecialOperation("abs", value);
    }

    /**
     * Факториал числа (дополнительная операция)
     */
    public long factorial(int n) {
        if (n < 0) {
            System.out.println("Факториал отрицательного числа не определен");
            return -1;
        }
        if (n > 20) {
            System.out.println("Факториал слишком большого числа может вызвать переполнение");
            return -1;
        }

        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }



}
