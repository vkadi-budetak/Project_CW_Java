public class AnyMethods_HW_16 {
    public static double calculatorSwitch1(
            double num1, double num2, String action) {
        double res = 0;
        switch (action) {
            case "+":
                res = num1 + num2;
                break;
            case "-":
                res = num1 - num2;
                break;
            case "*":
                res = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    res = num1 / num2;
                    break;
                } else {
                    res = 0;
                    System.out.println("Error, /0");
                    break;
                }
            default:
                System.out.println("Error, action not valid");
        }
        return res;
    }

    public static double calculatorSwitch2(double n1, double n2, String a) {
        return switch (a) {
            case "+" -> n1 + n2;
            case "-" -> n1 - n2;
            case "*" -> n1 * n2;
            case "/" -> n2 != 0 ? n1 / n2 : 0;
            default -> 0;
        };
    }
}
