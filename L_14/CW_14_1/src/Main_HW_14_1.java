import java.util.Scanner;

public class Main_HW_14_1 {
    public static void main(String[] args) {
        System.out.println("========login password Var========");
        String login = "user";
        String pass = "1q2w3e";
        String userLogin = "user";
        String userPass = "1q2w3e";

        if (login.equalsIgnoreCase(userLogin) && pass.equals(userPass)) {
            System.out.println("доступ разрешен");
        } else {
            System.out.println("доступ запрещен");
        }

        System.out.println();
        System.out.println("============== login password console ============");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter login >>>>>>>>>");
        userLogin = scanner.nextLine();
        System.out.println("Enter password >>>>>>>>>");
        userPass = scanner.nextLine();

        System.out.println(login + " | " + pass);
        System.out.println(userLogin + " | " + userPass);

        if (login.equalsIgnoreCase(userLogin) && pass.equals(userPass)) {
            System.out.println("доступ разрешен");
        } else {
            System.out.println("доступ запрещен");
        }
    }
}


 /*
        5.
        # Булевы операции: проверка логина и пароля

## 🔐 Задание
В программе заранее заданы логин/email и пароль. Пользователь «вводит» (через переменные) свои значения.
Выведите:
        - `доступ разрешен`, если логин и пароль совпадают;
- иначе — `доступ запрещен`.

        */