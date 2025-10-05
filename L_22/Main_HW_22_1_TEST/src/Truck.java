/**
 * Класс Truck представляет грузовик
 * Наследует от Car и добавляет поля company (компания) и capacity (грузоподъемность)
 */
public class Truck extends Car {
    private String company;    // Транспортная компания
    private double capacity;   // Грузоподъемность в тоннах

    /**
     * Конструктор по умолчанию
     */
    public Truck() {
        super();
        this.company = "Грузовые перевозки";
        this.capacity = 5.0; // 5 тонн по умолчанию
    }

    /**
     * Конструктор с параметрами
     */
    public Truck(String model, int year, String color, boolean customsCleared,
                 String company, double capacity) {
        super(model, year, color, customsCleared);
        this.company = company;
        this.capacity = capacity;
    }

    // Геттеры и сеттеры
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        if (capacity > 0 && capacity <= 50) { // Разумные ограничения
            this.capacity = capacity;
        } else {
            System.out.println("Некорректная грузоподъемность!");
        }
    }

    /**
     * Переопределение метода printAllFields()
     */
    @Override
    public void printAllFields() {
        super.printAllFields();
        System.out.println("Компания: " + company);
        System.out.println("Грузоподъемность: " + capacity + " тонн");
        System.out.println("Тип: Грузовик");
    }

    /**
     * Переопределение toString()
     */
    @Override
    public String toString() {
        return "Truck{" +
                "company='" + company + '\'' +
                ", capacity=" + capacity +
                "} " + super.toString();
    }
}

