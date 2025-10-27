import java.time.Period;
import java.util.*;

public class CarDemo {
    public static void main(String[] args) {
        System.out.println("========== HashMap ==============");
        HashMap<Car, Owner> garage = new HashMap<>();
        Car c1 = new Car("Audi", 2025, "10", "red");
        Car c2 = new Car("BMW", 2022, "4", "blue");
        Car c3 = new Car("Tesla", 2021, "5", "green");
        Car c4 = new Car("Volvo", 2023, "3", "white");
        Car c5 = new Car("Mazda", 2009, "22", "black");

        Owner ow1 = new Owner("Stefan", "Stefanson", 987123, "str.A");
        Owner ow2 = new Owner("Aleks", "Aleksson", 196345, "str.C");
        Owner ow3 = new Owner("Mitchel", "Mitchelson", 546784, "str.E");
        Owner ow4 = new Owner("James", "Jamesson", 345678, "str.J");
        Owner ow5 = new Owner("John", "Johnson", 230981, "str.O");

        garage.put(c1, ow1);
        garage.put(c2, ow2);
        garage.put(c3, ow3);
        garage.put(c4, ow4);
        garage.put(c5, ow5);

        printGarage(garage);

        System.out.println("========== LinkedHashMap ==============");
        LinkedHashMap<Car, Owner> garage1 = new LinkedHashMap<>();
        garage1.put(c1, ow1);
        garage1.put(c2, ow2);
        garage1.put(c3, ow3);
        garage1.put(c4, ow4);
        garage1.put(c5, ow5);

        printGarage(garage1);

        System.out.println("========== TreeMap ==============");
        TreeMap<Car, Owner> garage2 = new TreeMap<>();
        garage2.put(c1, ow1);
        garage2.put(c2, ow2);
        garage2.put(c3, ow3);
        garage2.put(c4, ow4);
        garage2.put(c5, ow5);

        printGarage(garage2);

    }

    private static void printGarage(Map<Car, Owner> map) {
        Set<Car> keys = map.keySet();
        for (Car c: keys){
            System.out.println("Car: " + c);
            System.out.println("Owner: " + map.get(c));
        }
        System.out.println("===========================");
    }
}

/*
1. Для класса CAR (модель, год выпуска, номер регистрации, цвет),
создайте HashMap, LinkedHashMap, TreeMap, где значениями будут
данные собственника Owner(Имя, Фамилия, номер паспорта, адрес).
Создайте пять записей, и распечатайте структуры...
 */
