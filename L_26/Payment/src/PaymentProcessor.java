public interface PaymentProcessor {
    boolean processPayment(double amount);
    // Константа - минимальное значения суммы транзакции
    double MAX_TRANSACTION_AMOUNT = 10000;

    boolean refundPayment(String transactionId, double amount);

    String getPaymentStatus(String transactionId);

    default boolean isAvailable() {
        return true;    // По умолчанию считаем, что система доступна
    }

    default boolean validateAmount(double amount) {
        return (amount > 0 && amount <= MAX_TRANSACTION_AMOUNT);
    }


    // Статический метод для создания тестового процессора
    static PaymentProcessor createTestProcessor() {
        return new PaymentProcessor() {
            @Override
            public boolean processPayment(double amount) {
                System.out.println("Тестовая обработка платежа на сумма " + amount);
                return true;
            }

            @Override
            public boolean refundPayment(String transactionId, double amount) {
                System.out.println("Тестовый возврат платежа " + transactionId +
                        " на сумму " + amount);
                return true;
            }

            @Override
            public String getPaymentStatus(String transactionId) {
                return "COMPLETED";
            }
        };
    }
}