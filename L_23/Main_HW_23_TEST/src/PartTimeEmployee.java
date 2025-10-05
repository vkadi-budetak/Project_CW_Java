public class PartTimeEmployee extends Employee{
    private int salaryPerHour;
    private int workHoursInMonth;

    public PartTimeEmployee(String name, int id, int salaryPerHour, int workHoursInMonth) {
        super(name, id);
        this.salaryPerHour = salaryPerHour;
        this.workHoursInMonth = workHoursInMonth;
    }

    public int getSalaryPerHour() {
        return salaryPerHour;
    }

    public void setSalaryPerHour(int salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }

    public int getWorkHoursInMonth() {
        return workHoursInMonth;
    }

    public void setWorkHoursInMonth(int workHoursInMonth) {
        this.workHoursInMonth = workHoursInMonth;
    }

    @Override
    public int calculateSalary() {
        return salaryPerHour * workHoursInMonth;
    }
}
