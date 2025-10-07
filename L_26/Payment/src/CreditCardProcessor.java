public class CreditCardProcessor implements PaymentProcessor {

    @Override
    public boolean processPayment(double amount) {
        // Логика обработки платежа через кредитную карту

        if(amount > 100) {
            System.out.println("На вашей карте установлен лимит 100 евро. Сумма " + amount + "\nболее установленного лимита");
            return false;
        }
        System.out.println("Обработка платежа кредитную карту на сумма " + amount);
        return false;
    }

    @Override
    public boolean refundPayment(String transactionId, double amount) {
        // Логика возврата платежа через кредитную карту
        System.out.println("Возврат платежа через Paypal " + transactionId + ", на сумму" + amount);
        return false;
    }

    @Override
    public String getPaymentStatus(String transactionId) {
        // Логика получения статуса платежа через кредитную карту
        return "PENDING";
    }

    @Override
    public boolean isAvailable() {
        // Переопределяем метод по умолчанию
        // Вызываем метод проверки доступности процессинга кредитных карт
        return chekProcessorAvailable();
    }

    private boolean chekProcessorAvailable(){
        // Логика проверки доступности
        return Math.random() > 0.1; // 90% вероятности доступности
    }
}
