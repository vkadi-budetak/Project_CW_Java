import java.util.Arrays;
import java.util.Scanner;

public class Main_HW_15_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введи три целых чисел через пробел! \n");
        System.out.print("Введи первое число => ");
        int a = scanner.nextInt();        //  int a = 12;
        System.out.print("Введи второе число => ");
        int b = scanner.nextInt();         // int b = 7;
        System.out.print("Введи третье число => ");
        int c = scanner.nextInt();          // int b = 34;

        // Варіант 1 — через if
        int maxIf = a;
        if (b > maxIf) maxIf = b;
        if (c > maxIf) maxIf = c;
        System.out.println("Max (if): " + maxIf);

        // Варіант 2 — тернарний оператор
        int maxTernary = (a > b) ? ((a > c) ? a : c)
                : ((b > c) ? b : c);
        System.out.println("Max (?:): " + maxTernary);

    }
}
/*
Введите три целых числа (через переменные или через консоль).
Выведите **наибольшее** двумя способами:
1) с использованием `if`,
2) с использованием тернарного оператора `?:`.
 */
