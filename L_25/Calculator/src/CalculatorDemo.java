public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Сумма 5 и 10: " + calc.add(5, 10));
        System.out.println("Сумма 1, 2, 3: " + calc.add(1, 2, 3));
        System.out.println("Сумма 2.5 и 3.5: " + calc.add(2.5, 3.5));

        System.out.println();
        int result = MathOper.add(1, 2);
        System.out.println(result);
        System.out.println(MathOper.add(7.5, 12.8));


    }
}
