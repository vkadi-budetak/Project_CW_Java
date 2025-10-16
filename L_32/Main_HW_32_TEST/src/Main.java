import java.util.Scanner;


public class  Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Sender sender = new Sender();

        while (true) {
            System.out.println("\n=== Mail Delivery ===");
            System.out.println("Выберите способ доставки почты:");
            System.out.println("1 - DHL");
            System.out.println("2 - Email");
            System.out.println("3 - Pigeon");
            System.out.println("0 - Выход");
            System.out.print("Ваш выбор: ");

            String choice = scanner.nextLine().trim();

            MailDeliveryService service = null;
            switch (choice) {
                case "1":
                    service = new DHL();
                    break;
                case "2":
                    service = new Email();
                    break;
                case "3":
                    service = new Pigeon();
                    break;
                case "0":
                    System.out.println("До свидания!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Неверный выбор. Повторите.");
                    continue;
            }

            sender.send(service);

        }
    }
}

/*
Задача 1.  Mail Delivery
* Создать интерфейс MailDeliveryService с одним методом void sendMail().
* Создайте класс DHL, который должен реализовать интерфейс MailDeliveryService.
Его способ отправки почты — напечатать что-то вроде: «Положи письмо в конверт, поставь марку, отправь».
* Создайте класс Email, который должен реализовать интерфейс MailDeliveryService.
Его способ отправки почты - напечатать что-то вроде: «Отправить по Интернету».
* Создайте класс Pigeon, который должен реализовать интерфейс MailDeliveryService.
Его способ отправки почты — напечатать что-то вроде:
«Голубь?! Серьезно!? в двадцать первом веке?!!! Ты сумасшедший! Я улетаю»
* Создайте класс Sender. Реализуйте в нем метод send(),
который в качестве аргумента принимает MailDeliveryService и отправляет почту с помощью данной службы.
* Реализуйте диалог с пользователем (использовать Scanner),
как отправлять почту и отправлять ее с помощью Sender.
 */