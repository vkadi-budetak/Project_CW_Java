public class SalaryCalculator {
    public static void main(String[] args) {

        Employee[] employees = new Employee[] {
                new FullTimeEmployee("Phillip", 1, 2500),
                new FullTimeEmployee("Alex", 2, 2600),
                new PartTimeEmployee("Robert", 3, 25, 63),
                new PartTimeEmployee("Robert", 4, 18, 81),
        };

        int totalSalaryMonth = 0;

        System.out.println("=== Ведомость ЗП сотрудников за месяц ===");

//        for (Employee emp: employees)

        for (int i = 0; i < employees.length; i++) {
            int salary = employees[i].calculateSalary();
            System.out.println((i + 1) + " " + employees[i].name + " " + salary);
            totalSalaryMonth += salary;
        }

        System.out.println("--- Всего за месяц ---");
        System.out.println("Итого: " + totalSalaryMonth);
    }
}
