import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<MailDeliveryService> services = new ArrayList<>(Arrays.asList(new Pigeon(), new DHL(), new Email()));

        Scanner sc = new Scanner(System.in);
        System.out.println("=== Вас приветсвует Delivery Service ===");
        System.out.println("Вы можете отправить свою посылку:\n " +
                "Pigeon -> Введите 1\n DHL -> Введите 2\n Email -> Введите 3\n Для выхода -> Введите 0");

        while (true) {
            System.out.print("Ваш выбор: ");
            String choice = sc.nextLine().trim();
            if (choice.equals("0")) {
                System.out.println("Выход.");
                break;
            } else if (choice.equals("1")) {
                services.get(0).sendMail();     // Pigeon
                break;
            } else if (choice.equals("2")) {
                services.get(1).sendMail();     // DHL
                break;
            } else if (choice.equals("3")) {
                services.get(2).sendMail();     // Email
                break;
            } else {
                System.out.println("Некорректный ввод.\n" +
                        " Pigeon -> Введите 1\n DHL -> Введите 2\n Email -> Введите 3\n Для выхода -> Введите 0");
            }
        }


    }
}
/**
 * Задача 1.  Mail Delivery
 * * Создать интерфейс MailDeliveryService с одним методом void sendMail().
 * * Создайте класс DHL, который должен реализовать интерфейс MailDeliveryService.
 * Его способ отправки почты — напечатать что-то вроде: «Положи письмо в конверт, поставь марку, отправь».
 * * Создайте класс Email, который должен реализовать интерфейс MailDeliveryService.
 * Его способ отправки почты - напечатать что-то вроде: «Отправить по Интернету».
 * * Создайте класс Pigeon, который должен реализовать интерфейс MailDeliveryService.
 * Его способ отправки почты — напечатать что-то вроде:
 * «Голубь?! Серьезно!? в двадцать первом веке?!!! Ты сумасшедший! Я улетаю»
 * * Создайте класс Sender. Реализуйте в нем метод send(),
 * который в качестве аргумента принимает MailDeliveryService и отправляет почту с помощью данной службы.
 * * Реализуйте диалог с пользователем (использовать Scanner),
 * как отправлять почту и отправлять ее с помощью Sender.
 */