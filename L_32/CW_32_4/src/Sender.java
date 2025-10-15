public class Sender {
    //Создаю метод send() который принимает MailDeliveryService и отправляет почту с помощью данной службы.
    public void send(MailDeliveryService mailDeliveryService) {
        System.out.println("Отправляю почту!");
        mailDeliveryService.sendMail();
        System.out.println("Почта отправлена");
    }

}
