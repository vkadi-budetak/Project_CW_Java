import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите ваш email: ");
            String email = scanner.nextLine();

            if (email.length() >= 5 &&
                    email.contains("@") &&
                    email.indexOf("@") != 0 &&
                    email.indexOf("@") != email.length() - 1) {

                System.out.println("Поздравляю, Вы ввели коректную почту!");
                break;
            } else {
                System.out.println("Упс, Вы ввели некоректную почту");
                System.out.println("Email - должен быть не менее 5 символов\nИметь символ @\n" +
                        "Символ @ не должна быть на первом или последнем месте");
                System.out.println("Попробуйте еще раз!");
                System.out.println("===========================");
            }
        }
    }
}

/*
HW_46_TEXT
1.
Создайте метод, который просит пользователя ввести email.
Email считается корректным, если:
в нем не менее 5 символов,
есть символ ‘@’, он не должен быть первым или последним
Создайте свой NotCorrectEmailFormatException
Если пользователь ввел некорректную строку метод должен выкидывать
NotCorrectEmailFormatException.
В main сделайте обработку Exception

2.
Допустим, у вас в программе есть класс Programmer. Кроме имени у нег есть
поле String status; и этот статус может иметь значение «доступен» «занят» и «не доступен».
У программиста необходимо реализовать метод String doWork(String taskMsg) который в качестве
результата, либо возвращает stringMsg большими буквами, либо ProgrammerBusyException,
либо ProgrammerUnavailableNowException в зависимости от текущего состояния программера.
В зависимости от результата, вызывающий main выводить результат работы или сообщение
«Программист занят другой задачей» или «Программист не доступен».
 */