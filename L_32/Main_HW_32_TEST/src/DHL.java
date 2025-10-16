public class DHL implements MailDeliveryService{
    @Override
    public void sendMail() {
        System.out.println("Положи письмо в конвертб, " + "наклей марку," + "отправь." );
    }
}
