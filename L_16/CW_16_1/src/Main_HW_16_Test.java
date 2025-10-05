
public class Main_HW_16_Test {
    public static void main(String[] args) {
        double num1=5.5, num2=7.7, result=0;
        String action="/";
        result=AnyMethods_HW_16.calculatorSwitch1(num1,num2,action);
        System.out.printf("%.2f %s %.2f = %.4f\n", num1, action,num2,result);

        result=AnyMethods_HW_16.calculatorSwitch2(num1,num2,action);
        System.out.printf("%.2f %s %.2f = %.4f\n", num1, action,num2,result);

    }
}
