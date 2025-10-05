/**
 * Конкретная реализация для текущего счета
 */
class CheckingAccount extends BankAccount {
    private final double MONTHLY_FEE; // Ежемесячная плата за обслуживание
    private final double MIN_BALANCE; // Минимальный баланс для отмены платы

    public CheckingAccount(String accountNumber, String ownerName, double initialBalance,
                           double interestRate, double monthlyFee, double minBalance) {
        super(accountNumber, ownerName, initialBalance, interestRate);
        this.MONTHLY_FEE = monthlyFee;
        this.MIN_BALANCE = minBalance;
    }

    /**
     * Реализация абстрактного метода для расчета процентов
     */
    @Override
    public double calculateInterest() {
        // Для текущего счета проценты начисляются только если баланс выше минимального
        if (balance > MIN_BALANCE) {
            double interest = balance * interestRate;
            System.out.println("Начислены проценты: " + interest + " руб.");
            return interest;
        } else {
            System.out.println("Проценты не начислены: баланс ниже минимального");
            return 0;
        }
    }

    /**
     * Реализация абстрактного метода для ежемесячного обслуживания
     */
    @Override
    public void calculatePerformMonthlyMaintenance() {
        // Начисляем проценты
        double interest = calculateInterest();
        balance += interest;

        // Взимаем плату за обслуживание, если баланс ниже минимального
        if (balance < MIN_BALANCE) {
            balance -= MONTHLY_FEE;
            System.out.println("Взимается плата за обслуживание: " + MONTHLY_FEE + " руб.");
        }

        System.out.println("Выполнено ежемесячное обслуживание. Новый баланс: " + balance + " руб.");
    }


    /**
     * Дополнительный метод, специфичный для текущего счета - выписка чека
     */
    public boolean writeCheck(String recipient, double amount) {
        if (amount <= 0) {
            System.out.println("Ошибка: Сумма чека должна быть положительной");
            return false;
        }

        if (amount > balance) {
            System.out.println("Ошибка: Недостаточно средств для выписки чека");
            return false;
        }

        balance -= amount;
        System.out.println("Выписан чек на сумму " + amount + " руб. получателю " + recipient);
        System.out.println("Новый баланс: " + balance + " руб.");
        return true;
    }
}

