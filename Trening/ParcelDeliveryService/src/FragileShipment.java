/**
 * Створюю підклас FragileShipment
 * Наслідується від Shipment і добавляються поля basePerKg(Базова ціна за кг)
 * і perKm(базова ціна за км) і FRAGILE_FEE , MIN_TOTAL
 */

public class FragileShipment extends Shipment {
    private static final double BASE_PER_KG = 20.0;
    private static final double PER_KM = 0.5;
    private static final double FRAGILE_FEE = 50.0; // Крихкий вантаж
    private static final double MIN_TOTAL = 120.0; // Мінімальне сума

    /**
     * КОНСТРУКТОР з параметрами
     */
    public FragileShipment(String description, int id, double weightKg, double distanceKm) {
        super(description, id, weightKg, distanceKm);
    }

    @Override
    public double calculatePrice() {
        double base = BASE_PER_KG * getWeightKg() + PER_KM * getDistanceKm() + FRAGILE_FEE;
        return Math.max(base, MIN_TOTAL);
    }
}
