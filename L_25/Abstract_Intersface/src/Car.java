public class Car extends Vehicle implements Drivable {


    public Car(String vin, String brand, int year) {
        super(vin, brand, year);

    }

    @Override
    public void start() {
        System.out.println("Автомобиль " + brand + " заводится");

    }

    @Override
    public void drive() {
        System.out.println("Автомобиль " + brand + " едет");
    }

    @Override
    public void brake() {
        System.out.println("Автомобиль " + brand + " тормозит");
    }
}
