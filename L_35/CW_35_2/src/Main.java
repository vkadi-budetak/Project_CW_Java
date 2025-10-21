public class Main {
    public static void main(String[] args) {
        int num1=10,num2=2, result=0;
        result=Calculator.add(num1,num2); //или (result=num1 +,-,/,* num2))
        System.out.println(num1+ " | "+ num2+ " | "+ result);

        num1=2_000_000_000;
        num2=1_000_000_000;

        result=Calculator.add(num1,num2);
        System.out.println(num1+ " | "+ num2+ " | "+ result);
        num1=100000;
        num2=200000;
        result=Calculator.mul(num1,num2);
        System.out.println(num1+ " | "+ num2+ " | "+ result);
        num2=0;
        result=Calculator.div(num1,num2);
        System.out.println(num1+ " | "+ num2+ " | "+ result);
    }
}