/**
 * Створюю абсткрактий клас "Shipment" з полями String description, int id,
 * double weightKg, double distanceKm
 */

public abstract class Shipment {
    private String description;
    private int id;
    private double weightKg;
    private double distanceKm;

    /**
     * Конструктор по замовченню
     */
    public Shipment() {
        this.description = "Незрозуміла посилка";
        this.id = 0;
        this.weightKg = 0.0;
        this.distanceKm = 0.0;
    }

    /**
     * Конструктор с параметрами
     *
     * @param description — опис посилки (напр., "Ноутбук").
     * @param id          — ідентифікатор.
     * @param weightKg    — вага в кілограмах (має бути > 0).
     * @param distanceKm  — відстань у кілометрах (має бути > 0).
     */
    public Shipment(String description, int id, double weightKg, double distanceKm) {
        if (description == null || description.isBlank()) {
            throw new IllegalArgumentException("description must be non-blank");
        }
        if (weightKg <= 0) {
            throw new IllegalArgumentException("weightKg must be > 0, got " + weightKg);
        }
        if (distanceKm <= 0) {
            throw new IllegalArgumentException("distanceKm must be > 0, got " + distanceKm);
        }
        this.description = description;
        this.id = id;
        this.weightKg = weightKg;
        this.distanceKm = distanceKm;
    }

    // Гетери і сетери
    public String getDescription() {
        return description;
    }

    public int getId() {
        return id;
    }

    public double getWeightKg() {
        return weightKg;
    }

    public double getDistanceKm() {
        return distanceKm;
    }

    // Cетери
    public void setDescription(String description) {
        this.description = description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setWeightKg(double weightKg) {
        this.weightKg = weightKg;
    }

    public void setDistanceKm(double distanceKm) {
        this.distanceKm = distanceKm;
    }

    /**
     * Абстрактний метод ціни
     *
     * @return - ціну
     */
    public abstract double calculatePrice();

    /**
     * Метод для виводу всіх полів обєкта
     * Цей метод буде перерозподілений в подкласах для добавлення спец полів.
     */
    public void printAllFields() {
        System.out.println("=== Загальна інформація про посилку ===");
        System.out.println("Зазначена назва: " + description);
        System.out.println("ID посилки: " + id);
        System.out.println("Вага в кг: " + weightKg);
        System.out.println("Відстань у км: " + distanceKm);
    }

    /**
     * Перерозподіл методу toString() для зручного виводу обєкта
     */
    @Override
    public String toString() {
        return "Shipment{" +
                "id=" + id + ", " + "description='" + description + ", "
                + "weightKg=" + weightKg + ", distanceKm=" + distanceKm +
                '}';
    }
}

