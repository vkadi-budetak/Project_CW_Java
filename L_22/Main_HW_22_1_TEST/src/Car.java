/*
Реализуйте базовый класс `Car` с полями: `model`, `year`, `color`, `customsCleared` и
методами: геттеры/сеттеры, конструкторы, `printAllFields()`, `toString()`.
Подклассы:
- `RacingCar(team)`,
- `PassengerCar(owner, passengers)`,
- `PublicCar(company, places)`,
- `Truck(company, capacity)` → `RefrigeratorTruck(temperature)`.
  Для каждого: геттеры/сеттеры, конструкторы, `printAllFields()`, `toString()`.
  Продемонстрируйте полиморфизм: массив/список `Car` и вызов `printAllFields()`.

 */

/**
 * Базовый класс Car представляет общие характеристики автомобиля
 * Содержит основные поля и методы, которые наследуются всеми подклассами
 */
public class Car {
    // Защищенные поля - доступны в подклассах
    private String model;        // Модель автомобиля
    private int year;           // Год выпуска
    private String color;       // Цвет автомобиля
    private boolean customsCleared; // Растаможен ли автомобиль

    /**
     * Конструктор по умолчанию
     */
    public Car() {
        this.model = "Неизвестная модель";
        this.year = 2000;
        this.color = "Белый";
        this.customsCleared = false;
    }

    /**
     * Конструктор с параметрами
     * @param model модель автомобиля
     * @param year год выпуска
     * @param color цвет
     * @param customsCleared статус растаможки
     */

    public Car(String model, int year, String color, boolean customsCleared) {
        this.model = model;
        this.year = year;
        this.color = color;
        this.customsCleared = customsCleared;
    }

    // Геттеры и сеттеры
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > 1885 && year <= 2024) { // Первый автомобиль был создан в 1885 году
            this.year = year;
        } else {
            System.out.println("Некорректный год выпуска!");
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isCustomsCleared() {
        return customsCleared;
    }

    public void setCustomsCleared(boolean customsCleared) {
        this.customsCleared = customsCleared;
    }

    /**
     * Метод для вывода всех полей объекта
     * Этот метод будет переопределен в подклассах для добавления специфичных полей
     */
    public void printAllFields() {
        System.out.println("=== Информация об автомобиле ===");
        System.out.println("Модель: " + model);
        System.out.println("Год выпуска: " + year);
        System.out.println("Цвет: " + color);
        System.out.println("Растаможен: " + (customsCleared ? "Да" : "Нет"));
    }

    /**
     * Переопределение метода toString() для удобного вывода объекта
     */
    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", customsCleared=" + customsCleared +
                '}';
    }
}


