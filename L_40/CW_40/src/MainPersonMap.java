import java.util.*;

public class MainPersonMap {
    public static void main(String[] args) {
        System.out.println("========== HashMap ==============");
        HashMap<Person, String> company = new HashMap<>();
        Person p1 = new Person("John", 101, 30.5);
        Person p2 = new Person("Jane", 107, 20.5);
        Person p3 = new Person("Mitchel", 102, 35.5);
        Person p4 = new Person("Emily", 106, 33.5);
        Person p5 = new Person("David", 103, 22.5);
        Person p6 = new Person("Sophia", 105, 20.5);
        Person p7 = new Person("James", 104, 50.5);

        company.put(p1, "QA engineer");
        company.put(p2, "director");
        company.put(p3, "sysadmin");
        company.put(p4, "developer");
        company.put(p5, "developer");
        company.put(p6, "team lead");
        company.put(p7, "QA manager");

        printCompany(company); // метод печати

        Person p8 = new Person("Emily", 106, 33.5);
        System.out.println(company.containsKey(p8)); // ищи такого работника;

        System.out.println("========== LinkedHashMap ==============");
        LinkedHashMap<Person, String> company1 = new LinkedHashMap<>();

        company1.put(p1, "QA engineer");
        company1.put(p2, "director");
        company1.put(p3, "sysadmin");
        company1.put(p4, "developer");
        company1.put(p5, "developer");
        company1.put(p6, "team lead");
        company1.put(p7, "QA manager");

        printCompany(company1); // метод печати
        System.out.println(company1.containsKey(p8)); // ищи такого работника;

        System.out.println("========== TreeMap ==============");

        TreeMap<Person, String> company2 = new TreeMap<>();
        company2.put(p1, "QA engineer");
        company2.put(p2, "director");
        company2.put(p3, "sysadmin");
        company2.put(p4, "developer");
        company2.put(p5, "developer");
        company2.put(p6, "team lead");
        company2.put(p7, "QA manager");

        printCompany(company2); // метод печати
        p8 = new Person("Emily", 111111, 77.5);
        System.out.println(company2.containsKey(p8)); // ищи такого работника;
    }

    private static void printCompany(Map<Person, String> map) {
        Set<Person> keys = map.keySet();
        for (Person p : keys){
            System.out.println(p);
            System.out.println("position: " + map.get(p));
        }
        System.out.println("===================================");
    }
}

/*
1. Для класса CAR (модель, год выпуска, номер регистрации, цвет),
создайте HashMap, LinkedHashMap, TreeMap, где значениями будут
данные собственника Owner(Имя, Фамилия, номер паспорта, адрес).
Создайте пять записей, и распечатайте структуры...
 */
