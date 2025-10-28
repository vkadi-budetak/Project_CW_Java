import java.util.Objects;

public class Car implements Comparable<Car> {
    private String model;
    private int year;
    private String serialNumber;
    private String color;

   //Конструктор
    public Car(String model, int year, String serialNumber, String color) {
        this.setModel(model);
        this.setYear(year);
        this.setSerialNumber(serialNumber);
        this.color = color;
    }

    //Геттеры и сеттеры
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }
    public String getColor() {
        return color;
    }
    public String getSerialNumber() {
        return serialNumber;
    }

    public void setModel(String model) {
        if (model != null && !model.isBlank()) this.model = model;
        else System.out.println("Error, model is not correct");
    }
    public void setYear(int year) {
        if (year > 2000) this.year = year;
        else System.out.println("Error, year is not correct, the car is old.");
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setSerialNumber(String serialNumber) {
        if (serialNumber != null && !serialNumber.isBlank()) this.serialNumber = serialNumber;
        else System.out.println("Error, serialNumber is not valid!");
    }

    @Override
    public String toString() {
        return "\uD83D\uDE97 model: " + model +
                ", year: " + year +
                ", serialNumber: " + serialNumber +
                ", color: " + color;
    }


    // Переопределяем equals и hashCode по serialNumber;
    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Car car)) return false;
        return Objects.equals(serialNumber, car.serialNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(serialNumber);
    }

    // Переопределяем Comparable для TreeMap
    @Override
    public int compareTo(Car other) {
        return this.serialNumber.compareTo(other.serialNumber);
    }
}
