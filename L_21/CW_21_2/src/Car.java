public class Car {
    private String plate;
    private String brand;
    private int year;
    private Person driver;

    public Car(String plate, String brand, int year, Person driver) {
        this.plate = plate;
        this.brand = brand;
        this.year = year;
        this.driver = driver;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Person getDriver() {
        return driver;
    }

    public void setDriver(Person driver) {
        this.driver = driver;
    }

    @Override
    public String toString() {
        return "Car{" +
                "plate='" + plate + '\'' +
                ", brand='" + brand + '\'' +
                ", year=" + year +
                ", driver=" + driver +
                '}';
    }

    public void signal(){
        System.out.println("bip ".repeat((this.brand.length())));
    }

    public static void openGate(Car car) {
        System.out.println("Open gate!!!!");
        System.out.println("Car plate : " + car.plate);
    }

}
