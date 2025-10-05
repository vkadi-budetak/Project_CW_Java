import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("========1=======");
        int a = 10;
        int b = 3;
        printRangeIncl(a, b);

        System.out.println("========2=======");
        System.out.println(sumEvenInRange(a, b));

        System.out.println("========3=======");
        int n = 5;
        System.out.println(factorial(n));






    }

    private static int factorial(int n) {
        int res = 0;
        for (int i = 2; i <= n; i++)
            res = n * i;
        return res;
    }

    private static int sumEvenInRange(int a, int b) {
        if (a > b) { int t = a; a = b; b = t; }

        int sum = 0;
        int start = (a % 2 == 0) ? a : a + 1; // перше парне в діапазоні
        for (int i = start; i <= b; i += 2) {
            sum += i;
        }
        return sum;
    }

    private static void printRangeIncl(int a, int b) {
        if (a <= b) {
            for (int i = a; i <= b; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = a; i >= b; i--) {
                System.out.println(i);
            }
        }
    }


}

