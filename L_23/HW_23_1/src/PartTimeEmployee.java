/**
 * Creating a subclass
 */
public class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;


    public PartTimeEmployee(String name, int id, double hourlyRate, int hoursWorked) { // Конструктор
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        System.out.println("Hello, I am " + name +  " => PartTimeEmployee.");
        System.out.println("my monthly salary - " + (hourlyRate * hoursWorked) + "$");
        return hourlyRate * hoursWorked;
    }
}
