public class MainAnyMethods {
    public static void main(String[] args) {
        int i1 = 5, i2 = 7;
        printAdd(i1, i2);
        double wage = 25.5, hours = 162.5, bonus = 500.7, tax = 11.5;
        double result = 0;
        result = calculateSalary(wage, hours, bonus, tax);
        System.out.println(result + " $");
        System.out.println(calculateSalary(wage, hours, bonus, tax) + " $");

        System.out.printf("Моя зарплата за месяц:%9.2f$", result);
        System.out.println();
        System.out.printf("wage:%.2f$, hours:%.2f, myBonys:%.2f$, tax:%.2f%%, salary=%.2f$",
                wage, hours, bonus, tax, result);
        double pi = 3.14159;
        System.out.printf("pi=%.2f\n", pi);
        System.out.printf("%.2f\n", (0.1+0.2));
        System.out.println(0.1+0.2);

        System.out.println("========================================================");
        int minInt = getMinInt();
        int maxInt = minInt - 1;
        System.out.println("minimal int value: " + minInt);
        System.out.println("maximal int value: " + maxInt);

        long minLong = getMinLong();
        long maxLong = minLong - 1;
        System.out.println("minimal int value: " + minLong);
        System.out.println("maximal int value: " + maxLong);
    }

    private static long getMinLong() {
        long res = 1; // 0000 0001 * 2 => 0000 0010 * 2 => 0000 0100 * 2 ...
        while (res > 0) {
            res *= 2; // всего итераций 63 за  0.0000....  секунды
        }
        return res;
    }

    private static int getMinInt() {
        int res = 1;
        while (res > 0) {
            res+=1; // всего итераций 2147483647 за  0.5 секунды
        }
        return res;
    }

    private static double calculateSalary(double wage,
                                          double hours, double bonus, double tax) {
        double salaryBrutto = wage * hours;
        double salaryTotal = salaryBrutto + bonus;
        double taxTotal = salaryTotal * tax / 100;
        return salaryTotal - taxTotal;

    }

    private static void printAdd(int i1, int i2) {
        int result = i1 + i2;
        System.out.println(result);
    }
}