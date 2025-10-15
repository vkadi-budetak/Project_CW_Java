public class Pigeon  implements MailDeliveryService{
    @Override
    public void sendMail() {
        System.out.println("Привязывай крепчею." + "Я полетел!!!");
    }
}
