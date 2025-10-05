public class BankDemo {
    public static void main(String[] args) {
        SavingsAccount savingsAccount1 = new SavingsAccount(
                "SA-12345", "Ivan Petrov", 10000, 0.05,
                3, 50);
        SavingsAccount savingsAccount2 = new SavingsAccount(
                "SA-12346", "Maria Sokolova", 20000, 0.05,
                5, 65);

        System.out.println("=== Операции по первому счету ===");
        savingsAccount1.deposit(2000);
        savingsAccount1.withdraw(500);
        savingsAccount1.withdraw(200);
        savingsAccount1.withdraw(100);
        System.out.println("Осталось бесплатных снятий: " + savingsAccount1.getRemainingFreeWithdrawals());
        savingsAccount1.withdraw(100);
        savingsAccount1.calculatePerformMonthlyMaintenance();

        System.out.println();
        System.out.println("=== Операции по второму счету ===");
        savingsAccount2.deposit(3000);
        savingsAccount2.withdraw(600);
        savingsAccount2.withdraw(300);
        savingsAccount2.withdraw(200);
        System.out.println("Осталось бесплатных снятий: " + savingsAccount2.getRemainingFreeWithdrawals());
        savingsAccount2.withdraw(100);
        savingsAccount2.calculatePerformMonthlyMaintenance();

        // Создаем текущий счет
        CheckingAccount checking = new CheckingAccount("CA-67890", "Мария Сидорова", 5000, 0.02, 100, 3000);

        // Демонстрация работы с текущим счетом
        System.out.println("\n=== Операции с текущим счетом ===");
        checking.displayInfo();
        checking.deposit(1000);
        checking.withdraw(2000);
        checking.writeCheck("ООО Рога и Копыта", 1500);
        checking.calculatePerformMonthlyMaintenance();

        // Демонстрация полиморфизма
        System.out.println("\n=== Демонстрация полиморфизма ===");
        BankAccount[] accounts = { savingsAccount1, checking, savingsAccount2 };

        for (BankAccount account : accounts) {
            System.out.println("\nОбработка счета: " + account.accountNumber);
            account.displayInfo();
            account.calculateInterest();
            // Обратите внимание: мы вызываем абстрактный метод через ссылку на базовый класс
            // Но выполняется конкретная реализация в зависимости от типа объекта
        }

    }
}
