/**
 * Створюю підклас ExpressShipment
 * Наслідується від Shipment і добавляються поля basePerKg(Базова ціна за кг)
 * і perKm(базова ціна за км) і плюс націнка = 1.2
 */

public class ExpressShipment extends Shipment {
    private static final double BASE_PER_KG = 20.0;
    private static final double PER_KM_EXPRESS = 0.9;
    private static final double SURCHARGE = 1.2;

    /**
     * КОНСТРУКТОР з параметрами
     */
    public ExpressShipment(String description, int id, double weightKg, double distanceKm) {
        super(description, id, weightKg, distanceKm);
    }

    @Override
    public double calculatePrice() {
        double base = BASE_PER_KG * getWeightKg() + PER_KM_EXPRESS * getDistanceKm();
        return base * SURCHARGE;
    }
}
