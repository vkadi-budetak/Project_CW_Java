public class DemoCar {
    public static void main(String[] args) {
        System.out.println("🚗 Демонстрация полиморфизма с автомобилями 🚗\n");

        RacingCar rc1 = new RacingCar("Ferrari F1", 2024, "Красный", true, "Scuderia Ferrari");
        PassengerCar pc1 = new PassengerCar(
                "Toyota Camry", 2022, "Черный", true, "Иван Петров", 5
        );
        Truck tr1 = new Truck("Volvo FH", 2020, "Белый", true, "Логистика Плюс", 7.5);

        RacingCar[] racingCars = {
                new RacingCar("Ferrari F1", 2024, "Красный", true, "Scuderia Ferrari"),
                new RacingCar("Accura", 2024, "Синий", true, "Acura Team"),
                // Ошибка! Так нельзя делать
//                new Truck("Volvo FH", 2020, "Белый", true, "Логистика Плюс", 7.5),
//                new PassengerCar(
//                        "Toyota Camry", 2022, "Черный", true, "Иван Петров", 5
//                )
        };

        // Создание массива объектов разных типов, но с общим базовым классом Car
        Car[] carsArray = {
                new RacingCar("Ferrari F1", 2024, "Красный", true, "Scuderia Ferrari"),
                new PassengerCar("Toyota Camry", 2022, "Черный", true, "Иван Петров", 5),
                new Truck("Volvo FH", 2020, "Белый", true, "Логистика Плюс", 7.5),
                new PublicCar("Mercedes Sprinter", 2021, "Желтый", true, "Городские автобусы", 25),
                new RefrigeratorTruck("Scania R450", 2023, "Серебристый", true, "Холодная доставка", 15.0, -25.0)
        };

        System.out.println("=== Демонстрация полиморфизма с массивом ===");
        System.out.println("Вызов метода printAllFields() для каждого объекта в массиве:\n");

        // Полиморфизм в действии: один и тот же код работает с объектами разных типов
        for (int i = 0; i < carsArray.length; i++) {
            System.out.println("Автомобиль №" + (i + 1) + ":");
            carsArray[i].printAllFields();  // Вызывается соответствующая версия метода для каждого типа
            System.out.println("======================================");
        }
    }
}
