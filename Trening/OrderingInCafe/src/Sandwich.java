/**
 * Створюю підклас Sandwich і наслідується від MenuItem і добавляю поля
 * basePrice (double, >=0), extraCount (int, >=0)
 * формула: price = basePrice + extraCount * 10.0 (кожен додаток +10)
 */

public class Sandwich extends MenuItem {
    private double basePrice;
    private int extraCount;
    private static final double APP = 10.0;


    /**
     * Конструктор
     * @param basePrice - базовий прайс
     * @param extraCount - додаткові інгридієнти
     */
    public Sandwich(String name, int id, double basePrice, int extraCount) {
        super(name, id);
        this.basePrice = basePrice;
        this.extraCount = extraCount;
    }

    @Override
    public double price() {
        double price = 0;
        return price = basePrice + extraCount * APP;
    }
}
