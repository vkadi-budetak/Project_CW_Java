public class PayPalProcessor implements PaymentProcessor {


    @Override
    public boolean processPayment(double amount) {
        // Логика обработки платежа через Paypal
        boolean isAmountValidate = validateAmount(amount);
        if(!isAmountValidate) {
            System.out.println("Сумма: " + amount + " недопустимая");
            return false; // (!isAmountValidate) -> (!isAmountValidate == false)
        }

        System.out.println("Обработка платежа через Paypal на сумма " + amount);
        return false;
    }

    @Override
    public boolean refundPayment(String transactionId, double amount) {
        // Логика возврата платежа через Paypal
        System.out.println("Возврат платежа через Paypal " + transactionId + ", на сумму" + amount);
        return false;
    }

    @Override
    public String getPaymentStatus(String transactionId) {
        // Логика получения статуса платежа через Paypal
        return "COMPLITED";
    }
}