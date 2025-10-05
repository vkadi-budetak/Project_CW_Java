/**
 * Класс RefrigeratorTruck представляет рефрижератор
 * Наследует от Truck и добавляет поле temperature (температура)
 * Это пример многоуровневого наследования: Car -> Truck -> RefrigeratorTruck
 */
public class RefrigeratorTruck extends Truck {
    private double temperature; // Температура в холодильной камере (в градусах Цельсия)

    /**
     * Конструктор по умолчанию
     */
    public RefrigeratorTruck() {
        super();
        this.temperature = -18.0; // Стандартная температура заморозки
    }

    /**
     * Конструктор с параметрами
     */
    public RefrigeratorTruck(String model, int year, String color, boolean customsCleared,
                             String company, double capacity, double temperature) {
        super(model, year, color, customsCleared, company, capacity);
        this.temperature = temperature;
    }

    // Геттер и сеттер для температуры
    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        if (temperature >= -50 && temperature <= 25) { // Разумные ограничения для рефрижератора
            this.temperature = temperature;
        } else {
            System.out.println("Некорректная температура для рефрижератора!");
        }
    }

    /**
     * Переопределение метода printAllFields()
     * Демонстрирует цепочку вызовов: RefrigeratorTruck -> Truck -> Car
     */
    @Override
    public void printAllFields() {
        super.printAllFields(); // Вызов метода класса Truck, который в свою очередь вызывает метод Car
        System.out.println("Температура: " + temperature + "°C");
        System.out.println("Тип: Рефрижератор");
    }

    /**
     * Переопределение toString()
     */
    @Override
    public String toString() {
        return "RefrigeratorTruck{" +
                "temperature=" + temperature +
                "} " + super.toString();
    }
}

