/**
 * Створюю абстрактний клас MenuItem з доп полями name (String), id (int)
 */

public abstract class MenuItem {
    private String name;
    private int id;

    /**
     * Конструктор
     *
     * @param name - імя
     * @param id   - номер замовлення
     */
    public MenuItem(String name, int id) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("description must be non-blank");
        }
        this.name = name;
        this.id = id;
    }

    /**
     * Абстрактний метод ціни
     */
    public abstract double price();

    /**
     * Перерозподіл методу toString()
     */
    @Override
    public String toString() {
        return "MenuItem{" + "id" + "="+ id + ", " + "name='" + name + "'}";
    }
}
