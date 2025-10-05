/**
 * Creating an abstract class
 */

abstract public class Employee {
    public String name;
    public int id;

    public Employee(String name, int id) {  // КОНСТРУКТОК
        this.name = name;
        this.id = id;
    }

    /**
     * Creating an abstract method
     */
    public abstract double calculateSalary();
}
