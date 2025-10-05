import java.util.Scanner;

/**
 * Абстрактный класс, представляющий банковский счет.
 * Содержит общие свойства и поведение для всех типов счетов
 */
public abstract class BankAccount {
    protected String accountNumber;
    protected String ownerName;
    protected double balance;
    protected double interestRate;

    public BankAccount(String accountNumber, String ownerName, double balance, double interestRate) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    /**
     * Общий метод для всех типов счетов - внесение средств
     */
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Внесено: " + amount + " евро. Новый баланс: " + balance + " евро." );
        } else {
            System.err.println("Ошибка: Сумма депозита должна быть положительной!");
        }
    }

    /**
     * Общий метод для всех типов счетов - снятие средств
     */
    public boolean withdraw(double amount) {
        if (amount <= 0) {
            System.err.println("Ошибка: Сумма снятия должна быть положительной!");
            return false;
        }

        if (amount > balance) {
            System.err.println("Ошибка: Недостаточно средств!");
            return false;
        }

        balance -= amount;
        System.out.println("Снято: " + amount + " евро. Новый баланс: " + balance + " евро." );
        return true;
    }

    /**
     * Метод для получения информации по счету
     */
    public void displayInfo() {
        System.out.println("Номер счета: " + accountNumber);
        System.out.println("Владелец: " + ownerName);
        System.out.println("Баланс: " + balance + " евро.");
        System.out.println("Процентная ставка: " + (interestRate * 100) + "%"); // 0.345 -> 3.45%, 1.012 -> 100.12%
    }

    /**
     * Абстрактный класс для расчета процентов
     * @return сумму начисленных процентов
     */
    public abstract double calculateInterest();

    /**
     * Абстрактный класс для расчета ежемесячного обслуживания счета
     * @return сумму ежемесячного обслуживания счета
     */
    public abstract void calculatePerformMonthlyMaintenance();

}
