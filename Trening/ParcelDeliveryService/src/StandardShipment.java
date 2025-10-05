/**
 * Створюю підклас StandardShipment
 * Наслідується від Shipment і добавляються поля basePerKg(Базова ціна за кг)
 * і perKm(базова ціна за км);
 */


public class StandardShipment extends Shipment {
    private static final double BASE_PER_KG = 20.0;  // - basePerKg - Базова ціна за кг
    private static final double PER_KM = 0.5;  // - perKm - базова ціна за км

    /**
     * КОНСТРУКТОР з параметрами
     */
    public StandardShipment(String description, int id, double weightKg, double distanceKm) {
        super(description, id, weightKg, distanceKm);
    }


    @Override
    public double calculatePrice() {
        return BASE_PER_KG * getWeightKg() + PER_KM * getDistanceKm();
    }
}