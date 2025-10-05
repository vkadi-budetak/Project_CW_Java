import java.util.Scanner;

public class Main_CW_14_2 {
    public static void main(String[] args) {
        String myStr = "Hello";
        System.out.println(myStr);

        Scanner myScan = new Scanner(System.in); // готовимся к чтению из консоли
        System.out.println("Enter you name: "); // Prompt
        myStr = myScan.nextLine();
        System.out.println(myStr + "      URAAAAAA");

        System.out.println("Enter you age: ");
        int age = myScan.nextInt();
        System.out.println(age);

        System.out.println("Enter value Pi: ");
        double myPi = myScan.nextDouble();
        System.out.println("Pi = " + myPi);

        myScan.nextLine(); // очистить буфер после чтения чисел

        System.out.println("Enter value Pi ver Parsing");
        myStr = myScan.nextLine();
        double myPi_1 = Double.parseDouble(myStr);
        System.out.println("Pi= " + myPi_1);

    }
}

/*
4.
# Мин/макс значений без switch/case и с ограничением по if

## 🧵 Задание
Напишите приложение, которое печатает **минимальное и максимальное** значения примитивных типов,
указанных в аргументах `main`.
Не используйте `switch/case`. Разрешено не более **трёх** операторов `if`.
Поддерживаемые типы: `byte`, `short`, `int`, `long`, `char`, `float`, `double`.
Если аргументов нет — выведите сведения для всех поддерживаемых типов. Для неизвестного
типа выведите `<аргумент> Wrong type`.


5.
# Булевы операции: проверка логина и пароля

## 🔐 Задание
В программе заранее заданы логин/email и пароль. Пользователь «вводит» (через переменные) свои значения.
Выведите:
- `доступ разрешен`, если логин и пароль совпадают;
- иначе — `доступ запрещен`.

 */
