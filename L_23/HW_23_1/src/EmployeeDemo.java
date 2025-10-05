/**
 * ### Домашнее задание: Абстрактные классы и методы
 * Создайте абстрактный класс `Employee` с полями `name`, `id`
 * и абстрактным методом `calculateSalary()`.
 * Затем создайте подклассы `FullTimeEmployee` и `PartTimeEmployee`,
 * которые наследуют от `Employee` и реализуют метод `calculateSalary()` по-разному.
 * Создайте массив объектов типа `Employee` и вычислите общую сумму зарплат всех сотрудников.
 */

public class EmployeeDemo {
    public static void main(String[] args) {
        System.out.println("Salaries of Sheriff employees ⭐");

        Employee[] employees = {
                new FullTimeEmployee("Abasov Sergey", 66345, 50000),
                new PartTimeEmployee("Stepanenko Oksana", 11543, 200, 80),
                new FullTimeEmployee("Harchenko Maria", 93456, 60000),
                new PartTimeEmployee("Marchenko Anastasia", 54678, 60000, 70),
                new FullTimeEmployee("Zaharchenko Anatoliy", 34234, 60000)
        };

//        Employee[] employees = new Employee[5];
//        employees[0] = new FullTimeEmployee("Abasov Sergey", 66345, 50000);
//        employees[1] = new PartTimeEmployee("Stepanenko Oksana", 11543, 200, 80);
//        employees[2] = new FullTimeEmployee("Harchenko Maria", 93456, 60000);
//        employees[3] = new FullTimeEmployee("Marchenko Anastasia", 54678, 60000);
//        employees[4] = new FullTimeEmployee("Zaharchenko Anatoliy", 34234, 60000);


        double totalSalary = 0;
        for (Employee employee : employees) { // Проходимся по масиву і рахуємо ЗП
            totalSalary += employee.calculateSalary();
        }
        System.out.println("=====================================");
        System.out.println("Total employee salary: " + totalSalary);
    }
}