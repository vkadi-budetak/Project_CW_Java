public class PaymentDemo {
    public static void main(String[] args) {
        // создаем процессоры платежей
        PaymentProcessor testProcessor = PaymentProcessor.createTestProcessor();
        PaymentProcessor payPal = new PayPalProcessor();
        PaymentProcessor creditCart = new CreditCardProcessor();

        // Обрабатываем платежи через разные системы
        processPaymentIfAvailable(testProcessor, 55.13);
        processPaymentIfAvailable(payPal, 112.55);
        processPaymentIfAvailable(creditCart, 127.99);
        processPaymentIfAvailable(payPal, 11200.55);
    }

    private static void processPaymentIfAvailable(PaymentProcessor processor, double amount) {
        if (processor.isAvailable()) {
            boolean success = processor.processPayment(amount);
            System.out.println("Платеж " + (success ? "успешно обработан" : "не удался"));
        } else {
            System.out.println("Платежная система недоступна.");
        }
    }
}
