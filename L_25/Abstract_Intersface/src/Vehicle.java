public abstract class Vehicle {
    private String vin;         // Приватное поле
    protected String brand;     // Защищенное поле
    public int year;            // Публичное поле

    // Static поле
    private static int vehicleCount = 0;

    public Vehicle(String vin, String brand, int year) {
        this.vin = vin;
        this.brand = brand;
        this.year = year;
        vehicleCount++;
    }

    // Абстрактный метод
    public abstract void start();

    // Конкретный (реализованный) метод
    public void displayInfo() {
        System.out.println("VIN: " + vin + ", Марка: " + brand + ", Год: " + year);
    }

    // Защищенный метод
    protected String getVin() {
        return vin;
    }

    // Статик метод
    public static int getVehicleCount() {
        return vehicleCount;
    }
}