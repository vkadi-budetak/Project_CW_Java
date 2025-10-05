public class Main_Garage {
    public static void main(String[] args) {

        Person p1 = new Person("Vlad", "ABS123", 123);
        Person p2 = new Person("Nastya", "ABS124", 321);
        Person p3 = new Person("Eva", 231);

        Car car1 = new Car("DE111", "BMW", 2020, p1);
        Car car2 = new Car("DE222", "Ford", 2022, p2);
        Car car3 = new Car("DE333", "Volvo", 2024, p2);
        Car car4 = new Car("DE444", "BMW", 2025, p3);

        System.out.println(car1);

        Person[] drivers = {p1,p2,p3};
        Car[] myGarage = {car1, car2, car3, car4};

        System.out.println("========================");
        // Виведем всіх драйверів
        for (Person p : drivers) {
            System.out.println(p);
            p.Greeting(); // - тут він представляється
        }

        System.out.println("========================");
        for(Car c: myGarage){
            System.out.println(c);
            c.signal();
            Car.openGate(c);
        }


    }
}