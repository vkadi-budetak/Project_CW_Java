/**
 * Creating a subclass
 */
public class FullTimeEmployee extends Employee {
    public double monthlySalary;

    public FullTimeEmployee(String name, int id, double monthlySalary) { //КОНСТРУКТОР
        super(name, id); // передаємо параметри Employee
        this.monthlySalary = monthlySalary;
    }


    @Override
    public double calculateSalary() {
        System.out.println("Hello, I am " + name +  " => FullTimeEmployee.");
        System.out.println("my monthly salary - " + monthlySalary + "$");
        return monthlySalary;
    }
}
