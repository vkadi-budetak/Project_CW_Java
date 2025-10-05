/**
 * Створюю підклас Drink(напитки) - наслідується MenuItem.
 * і добавляємо volumeMl - обєм в мл.
 */

public class Drink extends MenuItem {
    private int volumeMl;

    /**
     * Конструктор
     */
    public Drink(String name, int id, int volumeMl) {
        super(name, id);
        this.volumeMl = volumeMl;
    }

    public void setVolumeMl(int volumeMl) {
        if (volumeMl > 0)
            this.volumeMl = volumeMl;
    }

    @Override
    public double price() {
        double price = 0;
        return price = (volumeMl / 100.0) * 0.5;
    }
}

//price = (volumeMl / 100.0) * 0.5 (0.5 у.о. за кожні 100 мл)