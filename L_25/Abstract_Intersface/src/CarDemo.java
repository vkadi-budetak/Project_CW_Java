public class CarDemo {
    public static void main(String[] args) {
        Car car = new Car("ABC123", "Toyota", 2024);

        // Методы от абстрактного класса
        car.displayInfo();
        car.start();

        // Методы от интерфейса
        car.drive();
        car.brake();
        car.honk();

        // Static методы
        System.out.println("\nОбщее количество транспорта: " + Vehicle.getVehicleCount());
        Drivable.printMaxSpeed();

        Car car2 = new Car("BCA123", "BMW", 2023);
        System.out.println("\nОбщее количество транспорта: " + Vehicle.getVehicleCount());

        // Доступ к константам интерфейса
        System.out.println("Стандартная коробка передач: " + Drivable.DEFAULT_TRANSMISSION);


    }
}
