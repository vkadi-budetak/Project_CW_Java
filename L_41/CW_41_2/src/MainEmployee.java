import java.util.*;

public class MainEmployee {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(Arrays.asList(
                new Employee(123, "Vasya", "HP", 10000),
                new Employee(124, "Petya", "Nokia", 15000),
                new Employee(125, "Kolya", "Motorola", 20000),
                new Employee(126, "Olya", "Motorola", 15000),
                new Employee(127, "John", "HP", 25000),
                new Employee(128, "Jack", "Nokia", 13000)
        )
        );
        System.out.println(employees);

        /*хочу посчитать среднюю ЗП работников*/
        displayAverageMinMaxSalary(employees);

        System.out.println("==================================");

        /* хочу посчитать среднюю ЗП работников с Motorola*/
        displayAverageSalary(employees, "Motorola");

        System.out.println("==================================");

        /* хочу вывести ЗП работников у которых ЗП больше средней */
        displayEmployeesMoreAvgSalary(employees);

    }

    private static void displayEmployeesMoreAvgSalary(
            List<Employee> employees) {
        double avgSalary = employees.stream()
                .mapToInt(e-> e.salary)
                .average().getAsDouble();
        employees.stream().filter(e-> e.salary>avgSalary)
                .map(e->new NameSalary(e.name, e.salary))
//                .forEach(System.out::println);
                .forEach(n-> System.out.println(n.name+" "+n.salary));
    }

    private static void displayAverageSalary(List<Employee> employees, String company) {
        System.out.printf("average salary for company %s is %.2f\n", company,
                employees.stream()
                        .filter(e -> e.company.equals(company))
                        .mapToInt(e -> e.salary)
                        .average().orElse(0));  // orElse(0) - заглушка если нет компании Motorola вернет 0

        // или через optional - клас обгортка для null, так как average возвращает null.
        // Тогда используем orElse(0) или OptionalDouble
//        OptionalDouble temp = employees.stream()
//                      .filter(e -> e.company.equals(company))
//                       .mapToInt(e -> e.salary)
//                       .average();
//        if (temp.isEmpty())
//            System.out.println("ERROR, NO VALUE, company not valid");
//        else System.out.println(temp);


    }

    // summaryStatistics - Робота и збором статистики!!
    private static void displayAverageMinMaxSalary(List<Employee> employees) {
        IntSummaryStatistics statistics = employees.stream()    // IntSummaryStatistics - для роботи з СТИТИСТИКОЙ
                .mapToInt(e -> e.salary)
                .summaryStatistics(); // summaryStatistics() - собирает статистику любых приметивов

        System.out.printf(" min salary = %d, max salary = %d, average salary = %.2f\n",
                statistics.getMin(), statistics.getMax(), statistics.getAverage());
    }
}