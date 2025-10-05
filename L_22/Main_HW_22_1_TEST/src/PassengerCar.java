/**
 * Класс PassengerCar представляет легковой автомобиль
 * Наследует от Car и добавляет поля owner (владелец) и passengers (количество пассажиров)
 */
public class PassengerCar extends Car {
    private String owner;      // Владелец автомобиля
    private int passengers;    // Количество пассажиров

    /**
     * Конструктор по умолчанию
     */
    public PassengerCar() {
        super();
        this.owner = "Неизвестный владелец";
        this.passengers = 4; // Стандартное количество пассажиров для легкового авто
    }

    /**
     * Конструктор с параметрами
     */
    public PassengerCar(String model, int year, String color, boolean customsCleared,
                        String owner, int passengers) {
        super(model, year, color, customsCleared);
        this.owner = owner;
        this.passengers = passengers;
    }

    // Геттеры и сеттеры
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        if (passengers > 0 && passengers <= 8) { // Разумные ограничения
            this.passengers = passengers;
        } else {
            System.out.println("Некорректное количество пассажиров!");
        }
    }

    /**
     * Переопределение метода printAllFields()
     */
    @Override
    public void printAllFields() {
        super.printAllFields();
        System.out.println("Владелец: " + owner);
        System.out.println("Количество пассажиров: " + passengers);
        System.out.println("Тип: Легковой автомобиль");
    }

    /**
     * Переопределение toString()
     */
    @Override
    public String toString() {
        return "PassengerCar{" +
                "owner='" + owner + '\'' +
                ", passengers=" + passengers +
                "} " + super.toString();
    }
}
