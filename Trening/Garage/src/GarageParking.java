/**
 * Создаю абстрактный клас и задаю авраметри
 */
public abstract class GarageParking {
    private String num;         // Приватное поле - НОМЕР АВТОМОБИЛЯ
    private String color;       // Приватное поле - ЦВЕТ АВТОМОБИЛЯ
    protected String brand;     // Защищенное поле =
    public int year;            // Публичное поле

    // Static поле
    private static int autoCount = 0; // Лічильник автомобілів
    private static final int PARKINGSPACES = 100; // К-сть парковочних місць в гаражі

    /**
     * КОНСТРУКТОР
     * @param num - номер автомобіля
     * @param color - номер автомобіля
     * @param brand - марка автомобіля
     * @param year - рік автомобіля
     * autoCount++ - лічильник автомобілів
     */
    public GarageParking(String num, String color, String brand, int year) {
        this.num = num;
        this.color = color;
        this.brand = brand;
        this.year = year;
        autoCount++;
    }

    /**
     *   // Абстрактный метод - метод без реализации. Реализация будет в подклассе!
     */
    public abstract void start();

    /**
     * // Конкретный реализованый метод, по типу toString()
     */
    public void displayInfo() {
        System.out.println("Номер авто: " + num + ", Цвет авто: " + color + ", Марка: " + brand + ", Год: " + year);
    }

    /**
     *  // Защищенный метод — це спосіб дати контрольований доступ до приватного поля num для нащадків і класів у тому самому пакеті, не роблячи метод public.
     * @return надає доступ до num
     */
    protected String getNum(){
        return num;
    }

    /**
     * // Статик метод — це метод класу. Його можна викликати без створення екземпляра.
     * @return повертає кількість автомобілів в гаражі
     */
    public static int getAutoCount(){
        return autoCount;
    }

}