import java.util.Arrays;
import java.util.Scanner;

public class Main_CW_15_2 {
    public static void main(String[] args) {
        int a=5;
        System.out.println(a);//5
        a=a+1;
        System.out.println(a);//6
        a+=1; // синтаксически укороченная форма записи
        System.out.println(a);//7
        a++; // инкремент - увеличение на 1 постфикс - после числа
        System.out.println(a); //8
        a--; // декремент - уменьшение на 1 постфикс - после числа
        System.out.println(a); // 7
        System.out.println(a++); //7 сначала используем, а потом меняем
        System.out.println(a); //8
        ++a; // 9  инкремент - префиксная запись - сначала меняем, а потом используем
        System.out.println(a); //9
        System.out.println(++a); //10
        --a; // 9
        System.out.println(a); //9
        System.out.println(--a);//8

        System.out.println("========ТЕРНАРНЫЙ оператор=======");
        a=-5;
        if (a>=0)  System.out.println("a is a positive"); // ни чего не возвращает
        else System.out.println("a is a negative");
        System.out.println("a is a " + (a>=0 ? "positive" : "negative"));

        //  a , если значение а больше 5 то а надо умножить на 2 а иначе надо умножить на 3
        a=2;
        a = a >5 ? a*2 : a*3; // тут тернарный возвращает результат (один из двух) и его записываем в переменную
        System.out.println(a);

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter quantity of integer numbers:");
        int quantity=scanner.nextInt();

        for (int i=1; i<=quantity; i++){
            System.out.println(i+". Enter number:");
            int myNumber=scanner.nextInt();
            System.out.println("Ты ввел число "+ myNumber
                    + " и оно " + (myNumber%2==0 ? "четное" : "не четное"));
        }

        System.out.println("=============== Arrays ===========");
        int size=5;
        int[] ar1=new int[size]; // создай массив интов на сайз элементов
        System.out.println(Arrays.toString(ar1));
        Arrays.fill(ar1,5); //  заполните все элементы массива соответствующим значением
        System.out.println(Arrays.toString(ar1));
        printArray1(ar1); // хочу элементы в строчку но без скобочек и без запятых но с |
        printArray2(ar1); // хочу элементы в строчку но без скобочек и без запятых
    }

    private static void printArray2(int[] ar) { // печать с помощью цикла for each - для каждого
        for (int a: ar){ //
            System.out.print(a + "  ");
//            a=55;   // внутри форИч не получиться изменить первоначальный массив
        }
        System.out.println();
    }

    private static void printArray1(int[] ar) {
        for (int i=0; i<ar.length;i++){
            System.out.print(ar[i]+" | ");
        }

        System.out.println();
    }
}

/*
1.Даны температуры в двух колбах: `flask1` и `flask2`.
Прибор работает корректно, если **в одной** колбе температура
в диапазоне `[20; 40]`, а **в другой** — строго больше `75`.
Определите корректность работы прибора и выведите результат.
2.
Попросите пользователя (через переменную или через консоль) ввести номер месяца (1–12) и
выведите его название с помощью `switch`.
3.
Введите три целых числа (через переменные или через консоль).
Выведите **наибольшее** двумя способами:
1) с использованием `if`,
2) с использованием тернарного оператора `?:`.

 */

