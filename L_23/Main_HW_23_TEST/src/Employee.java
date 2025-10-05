/**
 * Создайте абстрактный класс `Employee` с полями `name`, `id` и абстрактным методом
 * `calculateSalary()`. Затем создайте подклассы `FullTimeEmployee` и `PartTimeEmployee`,
 * которые наследуют от `Employee` и реализуют метод `calculateSalary()` по-разному.
 * Создайте массив объектов типа `Employee` и вычислите общую сумму зарплат всех сотрудников.
 */

public abstract class Employee {
    String name;
    int id;

    public Employee(String name, int id) { // КОНСТРУКТОР
        this.name = name;
        this.id = id;
    }

    public abstract int calculateSalary();
}
