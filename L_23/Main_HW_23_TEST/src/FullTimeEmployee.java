public class FullTimeEmployee extends Employee {
    private int salary;

    public FullTimeEmployee(String name, int id, int salary) {
        super(name, id);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public int calculateSalary() {
        return salary;
    }
}

