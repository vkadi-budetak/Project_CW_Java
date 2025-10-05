public class SavingsAccount extends BankAccount {
    private int withdrawalsThisMonth;
    private final int FREE_WITHDRAWALS;
    private final double WITHDRAWALS_FEE;

    public SavingsAccount(String accountNumber, String ownerName, double balance,
                          double interestRate, int FREE_WITHDRAWALS, double WITHDRAWALS_FEE) {
        super(accountNumber, ownerName, balance, interestRate);
        this.FREE_WITHDRAWALS = FREE_WITHDRAWALS;
        this.WITHDRAWALS_FEE = WITHDRAWALS_FEE;
    }

    @Override
    public boolean withdraw(double amount) {
        // Проверяем, не превышен ли лимит на снятия
        if (withdrawalsThisMonth >= FREE_WITHDRAWALS) {
            // Если лимит превышен, то взимаем комиссию
            double totalAmount = amount + WITHDRAWALS_FEE;
            System.out.println("Применяется комиссия за снятие: " + WITHDRAWALS_FEE + " евро.");

            // Вызываем метод суперкласса (родительский) для выполнения снятия с учетом комиссии
            boolean success = super.withdraw(totalAmount);
            if (success) {
                withdrawalsThisMonth++;
            }
            return success;
        } else {
            // Если лимит не превышен, просто снимаем деньги
            boolean success = super.withdraw(amount);
            if (success) {
                withdrawalsThisMonth++;
            }
            return success;
        }
    }

    /**
     * Реализация абстрактного метода для расчета процентов
     * @return - сумму процентов
     */
    @Override
    public double calculateInterest() {
        double interest = balance * interestRate;
        System.out.println("Начислены проценты: " + interest + " евро.");
        return interest;
    }

    /**
     * Реализация абстрактного метода для расчета ежемесячного обслуживания
     * @return - сумма за ежемесячное обслуживание
     */
    @Override
    public void calculatePerformMonthlyMaintenance() {
        // Начисляем проценты
        double interest = calculateInterest();
        balance -= interest;

        withdrawalsThisMonth = 0;
        System.out.println("Выполнено ежемесячное обслуживание. Новый баланс: " + balance + " евро.");
    }

    public int getRemainingFreeWithdrawals() {
        return Math.max(0, FREE_WITHDRAWALS - withdrawalsThisMonth);
    }
}
